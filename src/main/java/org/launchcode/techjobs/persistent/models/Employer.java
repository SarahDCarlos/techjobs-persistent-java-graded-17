package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;
@Entity
public class Employer extends AbstractEntity {


    @Size(min = 3, max = 100, message = "name of location should be between 3 and 100")
    @NotBlank(message = "Location is required.")
    private String location;

    public Employer() {
    }

    public Employer(String location) {

        this.location = location;

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
