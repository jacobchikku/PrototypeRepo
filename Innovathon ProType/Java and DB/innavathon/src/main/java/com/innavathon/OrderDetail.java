package com.innavathon;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Create By: Emin George
 * Created On: 17/06/19
 */
@Entity
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String ownerGroup;
    private String objectType;
    private String quantity;

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

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public static void main(String [] args){

        try{
            String date = "Apr-19";
            SimpleDateFormat sdf = new SimpleDateFormat("MMM-yy");
            System.out.println(sdf.parse(date));
            System.out.print(String.format("%1$-" + 6 + "s", "emin"));
            System.out.print("George");
        }catch (ParseException ex){
            ex.printStackTrace();
        }

    }
}
