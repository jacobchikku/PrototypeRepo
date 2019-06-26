package com.innavathon;

import javax.persistence.*;

/**
 * Create By: Emin George
 * Created On: 15/06/19
 */
@Entity
@Table(name="Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
