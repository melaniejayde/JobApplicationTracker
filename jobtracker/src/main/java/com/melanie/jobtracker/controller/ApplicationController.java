package com.melanie.jobtracker.controller;

import com.melanie.jobtracker.model.JobApplication;
import com.melanie.jobtracker.service.JobApplicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApplicationController {

    private final JobApplicationService jobApplicationService;

    public ApplicationController(JobApplicationService jobApplicationService) {
        this.jobApplicationService = jobApplicationService;
    }

    @GetMapping("/api/applications")
    public List<JobApplication> getApplications() {
        return jobApplicationService.getAllApplications();
    }
}