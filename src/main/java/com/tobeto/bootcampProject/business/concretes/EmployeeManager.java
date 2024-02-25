package com.tobeto.bootcampProject.business.concretes;

import com.tobeto.bootcampProject.business.abstracts.EmployeeService;
import com.tobeto.bootcampProject.data_access.EmployeeRepository;
import com.tobeto.bootcampProject.entities.Employee;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
class EmployeeManager implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public Employee getById(
            final Integer employeeId
    ) {
        return employeeRepository
                .findById(employeeId)
                .orElseThrow(() -> new RuntimeException("User doesn't exist." + employeeId));
    }

    @Override
    public List<Employee> getAll() { return employeeRepository.findAll(); }

    @Override
    public Employee getEmployeeByEmail(
            final String email
    ) {
        return employeeRepository
                .findEmployeeByEmail(email)
                .orElseThrow(() -> new RuntimeException("User doesn't exist."));
     }
}