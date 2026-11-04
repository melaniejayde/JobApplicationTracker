package com.melanie.jobtracker.controller;

import com.melanie.jobtracker.model.JobApplication;
import com.melanie.jobtracker.service.JobApplicationService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/api/applications")
    public JobApplication createApplication(@RequestBody JobApplication application) {
        return jobApplicationService.createApplication(application);
    }

    @PutMapping("/api/applications/{id}")
    public JobApplication updateApplication(
            @PathVariable Long id,
            @RequestBody JobApplication application) {

        return jobApplicationService.updateApplication(id, application);
    }

    @DeleteMapping("/api/applications/{id}")
    public void deleteApplication(@PathVariable Long id) {
        jobApplicationService.deleteApplication(id);
    }
}