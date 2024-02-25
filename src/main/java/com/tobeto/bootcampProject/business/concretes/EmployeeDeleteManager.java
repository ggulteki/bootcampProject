package com.tobeto.bootcampProject.business.concretes;

import com.tobeto.bootcampProject.business.abstracts.EmployeeDeleteService;
import com.tobeto.bootcampProject.data_access.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
class EmployeeDeleteManager implements EmployeeDeleteService {

    private EmployeeRepository employeeRepository;

    @Override
    public void deleteEmployeeById(
            final Integer employeeId
    ) {
        employeeRepository.deleteById(employeeId);
    }
}
