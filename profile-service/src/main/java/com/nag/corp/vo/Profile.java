package com.nag.corp.vo;

public class Profile {

    public int id;
    public String profileName;
    public Double salary;

    public Profile(int id, String profileName, Double salary){
        this.id = id;
        this.profileName = profileName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
