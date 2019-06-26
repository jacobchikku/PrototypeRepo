package com.innavathon;

import javax.persistence.*;

/**
 * Create By: Emin George
 * Created On: 17/06/19
 */
@Entity
@Table(name="user_master")
public class UserMaster {

    @Id
    private String owner;
    private String ownerGroup;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwnerGroup() {
        return ownerGroup;
    }

    public void setOwnerGroup(String ownerGroup) {
        this.ownerGroup = ownerGroup;
    }
}
