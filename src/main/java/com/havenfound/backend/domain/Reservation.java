package com.havenfound.backend.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Reservation {
    @Id
    private Long id;

    //private Seeker seeker;

    //private Shelter shelter;

    //Date for reservation

    //Generated reservation code

    //public Reservation(Seeker seeker, Shelter shelter){
      //  this.seeker = seeker;
        //this.shelter = shelter;
    //}

    public Reservation(){}



    private String generateReservationCode(){
        return "";
    }




}
