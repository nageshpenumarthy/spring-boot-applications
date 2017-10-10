package com.nag.corp.service;

import com.nag.corp.vo.Profile;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProfileService {

    List<Profile> listOfProfiles = null;

    public ProfileService(){
        listOfProfiles = new ArrayList<>();
        Profile p1 = new Profile(1000, "Nagesh", 127000.0);
        Profile p2 = new Profile(1001, "Nagesh1", 127100.0);
        Profile p3 = new Profile(1002, "Nagesh2", 127200.0);
        Profile p4 = new Profile(1003, "Nagesh3", 127300.0);
        listOfProfiles.add(p1);
        listOfProfiles.add(p2);
        listOfProfiles.add(p3);
        listOfProfiles.add(p4);
    }

    @RequestMapping("/profile/id/{id}")
    public Profile getProfileById(@PathVariable("id") int id){
        return listOfProfiles.stream().filter(entry -> entry.getId() == id).findFirst().get();
    }

    @RequestMapping("/profile/name/{name}")
    public Profile getProfileByName(@PathVariable("name") String name){
        return listOfProfiles.stream().filter(entry -> entry.getProfileName() == name).findFirst().get();
    }

    @RequestMapping("/profile/")
    public List<Profile> getProfiles(){
        return listOfProfiles;
    }

}
