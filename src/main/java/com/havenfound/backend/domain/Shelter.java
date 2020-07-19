package com.havenfound.backend.domain;

import javax.persistence.*;

@Entity
@Table(name = "SHELTER", schema = "public")
public class Shelter {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column
    private String shelterName;

    protected int capacity = 0;

    protected int maxCapacity = 0;

    private String description;

    protected Shelter(){}

    public Shelter(String shelterName){
        this.shelterName = shelterName;
    }

    public Shelter(String shelterName, int maxCapacity){
        this.shelterName = shelterName;
        this.maxCapacity = maxCapacity;
    }

    

    public Shelter(String shelterName, String description){
        this.shelterName = shelterName;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format(
                "Shelter[id=%d, shelterName='%s']",
                id, shelterName);
    }

    public String getDescription(){
        return this.description;
    }
}


