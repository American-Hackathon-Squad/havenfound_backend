package com.havenfound.backend;

import com.havenfound.backend.domain.Reservation;
import com.havenfound.backend.domain.Shelter;
import com.havenfound.backend.repository.ReservationRepository;
import com.havenfound.backend.repository.ShelterRepository;
import com.havenfound.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ApplicationController {

    @Autowired
    ShelterRepository shelterRepository;

    @Autowired
    ReservationRepository reservationRepository;

        @GetMapping("/")
        public String home() {
            return "Welcome!";
        }

        @RequestMapping("/login")
        public String login(@PathVariable String username, @PathVariable String password){
            return UserService.login(username, password);
        }
        @GetMapping("/shelters/count")
        public int findShelterCount(){
            Shelter s1 = new Shelter("Shelter A");
            Shelter s2 = new Shelter("Shelter B");
            shelterRepository.save(s1);
            shelterRepository.save(s2);
            return shelterRepository.findAll().size();
        }
        @GetMapping("/shelters")
        public List<Shelter> findShelters(){
            return shelterRepository.findAll();
        }

        @GetMapping("/shelters/{shelterID}")
        public Optional<Shelter> getShelterDetails(@PathVariable Long shelterID){
            return shelterRepository.findById(shelterID);
        }

        @PutMapping("/shelters/{shelterID}/make_reservation")
        public Reservation makeNewReservation(@PathVariable Long shelterID, Date date){
            //return "FREAKING HECK WHY CAN'T ANYONE TELL ME HOW DATEPICKERS WORK IN REACT";
            int previousCapacity = shelterRepository.findShelterCapacityById(shelterID);
            shelterRepository.updateCapacity(previousCapacity - 1, shelterID);
            Reservation r1 =  new Reservation(shelterID, date);
            reservationRepository.save(r1);
            return r1;
        }
}
