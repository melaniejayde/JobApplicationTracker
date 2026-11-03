package com.melanie.jobtracker.service;

import com.melanie.jobtracker.model.JobApplication;
import com.melanie.jobtracker.repository.JobApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobApplicationService {

    private final JobApplicationRepository jobApplicationRepository;

    // Constructor injection
    public JobApplicationService(JobApplicationRepository jobApplicationRepository) {
        this.jobApplicationRepository = jobApplicationRepository;
    }

    // Retrieve all job applications
    public List<JobApplication> getAllApplications() {
        return jobApplicationRepository.findAll();
    }

    public JobApplication createApplication(JobApplication application) {
        return jobApplicationRepository.save(application);
    }

}