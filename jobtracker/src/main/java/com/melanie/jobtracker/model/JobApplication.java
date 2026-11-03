package com.melanie.jobtracker.model;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
public class JobApplication {

    public JobApplication() {

    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String company;
    private String position;
    private String location;
    @Enumerated(EnumType.STRING)
    private ApplicationStatus status;
    private String notes;
}
