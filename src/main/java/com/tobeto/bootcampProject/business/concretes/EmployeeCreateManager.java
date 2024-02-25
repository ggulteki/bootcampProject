package com.tobeto.bootcampProject.business.concretes;

import com.tobeto.bootcampProject.business.abstracts.EmployeeCreateService;
import com.tobeto.bootcampProject.business.request.create.employee.EmployeeCreateRequest;
import com.tobeto.bootcampProject.core.model_mapper.ModelMapperService;
import com.tobeto.bootcampProject.data_access.EmployeeRepository;
import com.tobeto.bootcampProject.entities.Employee;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
class EmployeeCreateManager implements EmployeeCreateService {

    private EmployeeRepository employeeRepository;
    private ModelMapperService modelMapperService;

    @Override
    public Employee createEmployee(
            final EmployeeCreateRequest employeeCreateRequest
    ) {
        Employee employeeToBeSave = modelMapperService
                .forRequest()
                .map(employeeCreateRequest, Employee.class);
        return employeeRepository.save(employeeToBeSave);
    }

}