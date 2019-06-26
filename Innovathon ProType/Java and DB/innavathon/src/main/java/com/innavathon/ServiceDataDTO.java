package com.innavathon;

/**
 * Create By: Emin George
 * Created On: 18/06/19
 */
public class ServiceDataDTO extends ServiceData{

    private float cost;
    private String price;



    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public ServiceDataDTO(float cost,String system,String client,String objektType,String objektName,String agent
            ,String platform,String status,String quantity,String serviceTyp,String verrechungsart,String materialNr,
                          String mandatenBezeichung,String preisegruppe,String systemTitle,String debtorKonsolidated,
                          String costCentreKonsolidated,String hostNameKonsolidated,String loginUser,String month){
        this.cost=cost;
        setSystem(system);
        setClient(client);
        setObjektType(objektType);
        setObjektName(objektName);
        setAgent(agent);
        setPlatform(platform);
        setStatus(status);
        setQuantity(quantity);
        setServiceTyp(serviceTyp);
        setVerrechungsart(verrechungsart);
        setMaterialNr(materialNr);
        setMandatenBezeichung(mandatenBezeichung);
        setPreisegruppe(mandatenBezeichung);
        setPreisegruppe(preisegruppe);
        setSystemTitle(systemTitle);
        setDebtorKonsolidated(debtorKonsolidated);
        setCostCentreKonsolidated(costCentreKonsolidated);
        setHostNameKonsolidated(hostNameKonsolidated);
        setLoginUser(loginUser);
        setMonth(month);
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
