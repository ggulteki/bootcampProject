package com.tobeto.bootcampProject.business.abstracts;

import com.tobeto.bootcampProject.business.request.create.employee.EmployeeCreateRequest;
import com.tobeto.bootcampProject.entities.Employee;

public interface EmployeeCreateService {

    Employee createEmployee(
            final EmployeeCreateRequest employeeCreateRequest
    );
}
