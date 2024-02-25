package com.tobeto.bootcampProject.business.abstracts;

import com.tobeto.bootcampProject.entities.Employee;

import java.util.List;

public interface EmployeeService {

    Employee getById(final Integer employeeId);

    List<Employee> getAll();

    Employee getEmployeeByEmail(
            final String email
    );
}
