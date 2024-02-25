package com.tobeto.bootcampProject.data_access;

import com.tobeto.bootcampProject.entities.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantRepository extends JpaRepository<Applicant, Integer> {
}
