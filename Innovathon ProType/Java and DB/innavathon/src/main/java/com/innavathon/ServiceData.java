package com.innavathon;

import javax.persistence.*;

/**
 * Create By: Emin George
 * Created On: 15/06/19
 */
@Entity
public class ServiceData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String system;
    private String client;
    private String objektType;
    private String objektName;
    private String agent;
    private String platform;
    private String status;
    private String quantity;
    private String serviceTyp;
    private String verrechungsart;
    private String materialNr;
    private String mandatenBezeichung;
    private String preisegruppe;
    private String comments;
    private String systemTitle;
    private String debtorKonsolidated;
    private String costCentreKonsolidated;
    private String hostNameKonsolidated;
    private String loginUser;
    private String month;
    @Transient
    private String price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getObjektType() {
        return objektType;
    }

    public void setObjektType(String objektType) {
        this.objektType = objektType;
    }

    public String getObjektName() {
        return objektName;
    }

    public void setObjektName(String objektName) {
        this.objektName = objektName;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
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

    public String getMaterialNr() {
        return materialNr;
    }

    public void setMaterialNr(String materialNr) {
        this.materialNr = materialNr;
    }

    public String getMandatenBezeichung() {
        return mandatenBezeichung;
    }

    public void setMandatenBezeichung(String mandatenBezeichung) {
        this.mandatenBezeichung = mandatenBezeichung;
    }

    public String getPreisegruppe() {
        return preisegruppe;
    }

    public void setPreisegruppe(String preisegruppe) {
        this.preisegruppe = preisegruppe;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getSystemTitle() {
        return systemTitle;
    }

    public void setSystemTitle(String systemTitle) {
        this.systemTitle = systemTitle;
    }

    public String getDebtorKonsolidated() {
        return debtorKonsolidated;
    }

    public void setDebtorKonsolidated(String debtorKonsolidated) {
        this.debtorKonsolidated = debtorKonsolidated;
    }

    public String getCostCentreKonsolidated() {
        return costCentreKonsolidated;
    }

    public void setCostCentreKonsolidated(String costCentreKonsolidated) {
        this.costCentreKonsolidated = costCentreKonsolidated;
    }

    public String getHostNameKonsolidated() {
        return hostNameKonsolidated;
    }

    public void setHostNameKonsolidated(String hostNameKonsolidated) {
        this.hostNameKonsolidated = hostNameKonsolidated;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
