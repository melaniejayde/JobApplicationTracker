package com.melanie.jobtracker.service;

import com.melanie.jobtracker.model.JobApplication;
import com.melanie.jobtracker.repository.JobApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobApplicationService {

    private final JobApplicationRepository jobApplicationRepository;

    public JobApplicationService(JobApplicationRepository jobApplicationRepository) {
        this.jobApplicationRepository = jobApplicationRepository;
    }

    // Retrieve all job applications
    public List<JobApplication> getAllApplications() {
        return jobApplicationRepository.findAll();
    }

    // Create a new job application
    public JobApplication createApplication(JobApplication application) {
        return jobApplicationRepository.save(application);
    }

    // Update an existing job application
    public JobApplication updateApplication(Long id, JobApplication updatedApplication) {

        JobApplication existingApplication = jobApplicationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Application not found"));

        existingApplication.setCompany(updatedApplication.getCompany());
        existingApplication.setPosition(updatedApplication.getPosition());
        existingApplication.setLocation(updatedApplication.getLocation());
        existingApplication.setStatus(updatedApplication.getStatus());
        existingApplication.setNotes(updatedApplication.getNotes());

        return jobApplicationRepository.save(existingApplication);
    }

    public void deleteApplication(Long id) {
        JobApplication existingApplication = jobApplicationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Application not found"));

        jobApplicationRepository.delete(existingApplication);
    }
}