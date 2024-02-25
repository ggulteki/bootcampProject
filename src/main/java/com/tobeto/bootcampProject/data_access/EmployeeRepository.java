package com.tobeto.bootcampProject.data_access;

import com.tobeto.bootcampProject.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Optional<Employee> findEmployeeByEmail(
            final String email
    );
}
