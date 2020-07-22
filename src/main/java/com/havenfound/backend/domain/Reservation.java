package com.havenfound.backend.domain;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Long seekerID;

    private Long shelterID;

    private Date checkinDate;

    private String reservationCode;


    //Generated reservation code

    public Reservation(Long seeker, Long shelter, Date date){
        this.seekerID = seeker;
        this.shelterID = shelter;
        this.checkinDate = date;
        this.reservationCode = generateReservationCode();
    }

    public Reservation(){}



    private String generateReservationCode(){
        return "";
    }




}
