package com.innavathon;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Create By: Emin George
 * Created On: 16/06/19
 */
@RestController
@RequestMapping("/api")
public class InnavathonController {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ServiceDataRepository serviceDataRepository;

    @Autowired
    private UserMasterRepository userMasterRepository;

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @RequestMapping(value = "/{ownerGroup}", method = RequestMethod.GET)
    public List<SapDataDTO> getStatus(@PathVariable("ownerGroup") String ownerGroup){

        return  serviceDataRepository.getDataForSAP();

    }
    @RequestMapping(value = "/abc", method = RequestMethod.POST)
    public Employee postData(HttpServletRequest request, @RequestBody Employee employee) throws Exception{


        if(!employee.getName().equals("Emin")){
            throw new Exception("Not valid");
        }

        employeeRepository.save(employee);
        return employee;
    }

    @RequestMapping(value="/save", method=RequestMethod.POST)
    public  String saveServiceData(@RequestBody List<ServiceData> serviceDatas){
        serviceDataRepository.saveAll(serviceDatas);
        return "success";
    }

    @RequestMapping(value="/customer/{ownerGroup}", method=RequestMethod.GET)
    public List<ServiceDataDTO> getCustomerData(@PathVariable("ownerGroup") String ownerGroup) throws Exception{

        List<ServiceDataDTO> serviceDatas=null;
        if(ownerGroup.trim().toLowerCase().equals("admin")){
           serviceDatas=serviceDataRepository.findServiceDataWithCostDetailsAdmin();
            return serviceDatas;
        }
        Integer count=userMasterRepository.getRowCountByOwnerGroup(ownerGroup.trim());
        if(count==0){
            throw  new Exception("The customer "+ownerGroup+" is not a valid one");
        }
        serviceDatas= serviceDataRepository.findServiceDataWithCostDetails(ownerGroup.trim());
       return serviceDatas;

    }

    @RequestMapping(value="/sap", method = RequestMethod.GET)
    public String generateSapInput(){


        List<SapDataDTO> sapDataDTOs = serviceDataRepository.getDataForSAP();
        writeFileToSAP(sapDataDTOs);

        return  "Success";
    }

    private void writeFileToSAP(List<SapDataDTO> sapDataDTOs){
        StringBuilder output = new StringBuilder();
        if(!CollectionUtils.isEmpty(sapDataDTOs)){
            sapDataDTOs.forEach(sapDataDTO->{

                output.append(String.format("%1$-" + 10 + "s", sapDataDTO.getCustomer()));
                output.append(String.format("%1$-" + 10 + "s", sapDataDTO.getLoginUser()));
                output.append(String.format("%1$-" + 8 + "s", sapDataDTO.getObjectType()));
                output.append(String.format("%1$-" + 20 + "s", sapDataDTO.getObjectName()));
                output.append(String.format("%1$-" + 10 + "s", sapDataDTO.getServiceTyp()));
                output.append(String.format("%1$-" + 20 + "s", sapDataDTO.getVerrechungsart()));
                output.append(String.format("%1$-" + 14 + "s", sapDataDTO.getCostcentreConsolidated()));

                Float  price = Float.parseFloat(sapDataDTO.getPricePerGroup());
                Float quantity=Float.parseFloat(sapDataDTO.getQuantity());
                Float totalPrice=price*quantity;
                output.append(String.format("%1$-" + 5 + "s", sapDataDTO.getQuantity()));
                output.append(String.format("%1$-" + 20 + "s", totalPrice.toString()));
                output.append(String.format("%1$-" + 10 + "s", sapDataDTO.getMonth()));
                output.append("\n");

            });

        }
        Date date = new Date();
        File file = new File("log/sap_file_"+ date.toString()+".txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(output.toString());
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
