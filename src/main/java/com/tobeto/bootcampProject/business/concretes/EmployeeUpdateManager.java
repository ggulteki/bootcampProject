package com.tobeto.bootcampProject.business.concretes;

import com.tobeto.bootcampProject.business.abstracts.EmployeeUpdateService;
import com.tobeto.bootcampProject.business.request.update.employee.EmployeeUpdateRequest;
import com.tobeto.bootcampProject.core.model_mapper.ModelMapperService;
import com.tobeto.bootcampProject.data_access.EmployeeRepository;
import com.tobeto.bootcampProject.entities.Employee;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeUpdateManager implements EmployeeUpdateService {

    private EmployeeRepository employeeRepository;
    private ModelMapperService modelMapperService;

    @Override
    public Employee updateEmployee(
            final Integer employeeId,
            final EmployeeUpdateRequest employeeUpdateRequest
    ) {
        Employee employeeToBeUpdate = employeeRepository
                .findById(employeeId)
                .orElseThrow(() -> new RuntimeException("baba akü yok"));

        modelMapperService
                .forRequest()
                .map(employeeUpdateRequest, employeeToBeUpdate);

        return employeeRepository.save(employeeToBeUpdate);
    }
}
