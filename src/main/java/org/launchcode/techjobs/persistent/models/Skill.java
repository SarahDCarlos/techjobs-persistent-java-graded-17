package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {


    @Size(max = 200, message = "Description is too long.")
    @NotNull(message = "description is required")



    private String description;

    @ManyToMany(mappedBy = "skills")
        private List<Job>jobs = new ArrayList<>();
    public Skill(String description) {
            this.description = description;
        }

        public Skill(){

        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

         public List<Job> getJobs() {
        return jobs;
    }

          public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}

