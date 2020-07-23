package com.havenfound.backend.domain;

import javax.persistence.*;
import java.io.File;

@Entity
@Table(name = "SHELTER", schema = "public")
public class Shelter {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column
    private String shelterName;

    protected int capacity = 0;

    private String description;

    //private File shelterImage = new File("/../../../../../resources/Generic Shelter Image.png");

    //Next we should try image url
    private String shelterImage = "/../../../../../resources/Generic Shelter Image.png";

    protected Shelter(){}

    public Shelter(String shelterName){
        this.shelterName = shelterName;
    }

    public Shelter(String shelterName, int maxCapacity){
        this.shelterName = shelterName;
    }

    

    public Shelter(String shelterName, String description){
        this.shelterName = shelterName;
        this.description = description;
        this.capacity = 0;
    }

    @Override
    public String toString() {
        return String.format(
                "Shelter[id=%d, shelterName='%s']",
                id, shelterName);
    }

    public Long getId(){
        return this.id;
    }

    public String getShelterName(){
        return this.shelterName;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public String getShelterImage(){
        return this.shelterImage;
    }

    public void setShelterImage(String shelterImage){
        this.shelterImage = shelterImage;
    }

    public String getDescription(){
        return this.description;
    }


}


