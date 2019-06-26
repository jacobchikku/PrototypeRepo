package com.innavathon;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Create By: Emin George
 * Created On: 17/06/19
 */
@Entity
public class CostDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String ownerGroup;
    private String priceGroup;
    private String pricePerGroup;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOwnerGroup() {
        return ownerGroup;
    }

    public void setOwnerGroup(String ownerGroup) {
        this.ownerGroup = ownerGroup;
    }

    public String getPriceGroup() {
        return priceGroup;
    }

    public void setPriceGroup(String priceGroup) {
        this.priceGroup = priceGroup;
    }

    public String getPricePerGroup() {
        return pricePerGroup;
    }

    public void setPricePerGroup(String pricePerGroup) {
        this.pricePerGroup = pricePerGroup;
    }
}
