package com.melanie.jobtracker.repository;

import com.melanie.jobtracker.model.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {
}
