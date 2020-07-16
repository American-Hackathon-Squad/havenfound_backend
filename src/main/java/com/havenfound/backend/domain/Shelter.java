package com.havenfound.backend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shelter {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String shelterName;

    //Requirements


    private String description;

    public Shelter(String shelterName){
        this.shelterName = shelterName;
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


