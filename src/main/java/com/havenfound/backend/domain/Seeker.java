package com.havenfound.backend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Seeker {

    @Id
    private Long id;

    public Seeker(){
    }


}
