package com.innavathon;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Create By: Emin George
 * Created On: 17/06/19
 */
public interface ServiceDataRepository extends CrudRepository<ServiceData, Integer> {

    ServiceData findBySystem(String system);

    @Query("select sd from ServiceData sd inner join UserMaster um on sd.loginUser=um.owner where   um.ownerGroup = :ownerGroup")
    List<ServiceData> findServiceDataByOwnerGroup(@Param("ownerGroup") String ownerGroup);

    @Query("select new com.innavathon.SapDataDTO(cd.ownerGroup as customer, sd.system, sd.objektType as objectType, sd.month as month, " +
            "sd.loginUser, cd.pricePerGroup, sd.objektName as objectName, sd.quantity, sd.costCentreKonsolidated as costcentreConsolidated, sd.serviceTyp, sd.verrechungsart ) " +
            "from ServiceData sd inner join UserMaster um on um.owner=sd.loginUser " +
            "inner join CostDetail cd on cd.ownerGroup=um.ownerGroup ")
    List<SapDataDTO> getDataForSAP();
    @Override
    List<ServiceData> findAll();

    @Query("select new com.innavathon.ServiceDataDTO(cast(cd.pricePerGroup as float)*cast(sd.quantity as float) as cost, sd.system, sd.client, sd.objektType, sd.objektName, sd.agent , sd.platform, " +
            "sd.status, sd.quantity, sd.serviceTyp, sd.verrechungsart, sd.materialNr, sd.mandatenBezeichung, sd.preisegruppe, " +
            "sd.systemTitle, sd.debtorKonsolidated, sd.costCentreKonsolidated, sd.hostNameKonsolidated, sd.loginUser, sd.month ) " +
            " from ServiceData sd inner join UserMaster um on um.owner=sd.loginUser " +
            "inner join CostDetail cd on cd.ownerGroup=um.ownerGroup where um.ownerGroup = :ownerGroup")
    List<ServiceDataDTO> findServiceDataWithCostDetails(@Param("ownerGroup") String ownerGroup);

    @Query("select new com.innavathon.ServiceDataDTO(cast(cd.pricePerGroup as float)*cast(sd.quantity as float) as cost, sd.system, sd.client, sd.objektType, sd.objektName, sd.agent , sd.platform, " +
            "sd.status, sd.quantity, sd.serviceTyp, sd.verrechungsart, sd.materialNr, sd.mandatenBezeichung, sd.preisegruppe, " +
            "sd.systemTitle, sd.debtorKonsolidated, sd.costCentreKonsolidated, sd.hostNameKonsolidated, sd.loginUser, sd.month ) " +
            " from ServiceData sd inner join UserMaster um on um.owner=sd.loginUser " +
            "inner join CostDetail cd on cd.ownerGroup=um.ownerGroup")
    List<ServiceDataDTO> findServiceDataWithCostDetailsAdmin();

}
