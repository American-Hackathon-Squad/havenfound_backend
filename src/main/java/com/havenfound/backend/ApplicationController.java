package com.havenfound.backend;

import com.havenfound.backend.domain.Shelter;
import com.havenfound.backend.repository.ShelterRepository;
import com.havenfound.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApplicationController {

    @Autowired
    ShelterRepository shelterRepository;

        @RequestMapping("/")
        public String home() {
            return "Welcome!";
        }

        @RequestMapping("/login")
        public String login(@PathVariable String username, @PathVariable String password){
            return UserService.login(username, password);
        }
        @RequestMapping("/shelters")
        public int findShelterCount(){
            Shelter s1 = new Shelter("Shelter A");
            Shelter s2 = new Shelter("Shelter B");
            shelterRepository.save(s1);
            shelterRepository.save(s2);
            return shelterRepository.findAll().size();
        }
        //public List<Shelter> findShelters(){
            //return shelterRepository.findAll();
        //}
}
