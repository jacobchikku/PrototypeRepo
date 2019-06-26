package com.innavathon;

/**
 * Create By: Emin George
 * Created On: 17/06/19
 */
public class SapDataDTO {

    private String customer;
    private String system;
    private String objectType;
    private String month;
    private String loginUser;
    private String pricePerGroup;
    private String objectName;
    private String quantity;
    private String costcentreConsolidated;
    private String serviceTyp;
    private String verrechungsart;



    public SapDataDTO(String customer,String system,String objectType,String month,String loginUser,String pricePerGroup,
                      String objectName, String quantity, String costcentreConsolidated,String serviceTyp,String verrechungsart){
        this.customer=customer;
        this.system = system;
        this.objectType = objectType;
        this.month = month;
        this.loginUser = loginUser;
        this.pricePerGroup = pricePerGroup;
        this.objectName = objectName;
        this.quantity = quantity;
        this.costcentreConsolidated = costcentreConsolidated;
        this.serviceTyp = serviceTyp;
        this.verrechungsart = verrechungsart;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public String getPricePerGroup() {
        return pricePerGroup;
    }

    public void setPricePerGroup(String pricePerGroup) {
        this.pricePerGroup = pricePerGroup;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getCostcentreConsolidated() {
        return costcentreConsolidated;
    }

    public void setCostcentreConsolidated(String costcentreConsolidated) {
        this.costcentreConsolidated = costcentreConsolidated;
    }

    public String getServiceTyp() {
        return serviceTyp;
    }

    public void setServiceTyp(String serviceTyp) {
        this.serviceTyp = serviceTyp;
    }

    public String getVerrechungsart() {
        return verrechungsart;
    }

    public void setVerrechungsart(String verrechungsart) {
        this.verrechungsart = verrechungsart;
    }
}
