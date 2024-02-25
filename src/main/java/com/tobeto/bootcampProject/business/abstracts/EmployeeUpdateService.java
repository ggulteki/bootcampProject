package com.tobeto.bootcampProject.business.abstracts;

import com.tobeto.bootcampProject.business.request.update.employee.EmployeeUpdateRequest;
import com.tobeto.bootcampProject.entities.Employee;

public interface EmployeeUpdateService {

    Employee updateEmployee(
            final Integer employeeId,
            final EmployeeUpdateRequest employeeUpdateRequest
    );
}
