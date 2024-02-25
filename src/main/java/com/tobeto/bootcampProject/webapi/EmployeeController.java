package com.tobeto.bootcampProject.webapi;

import com.tobeto.bootcampProject.business.abstracts.EmployeeCreateService;
import com.tobeto.bootcampProject.business.abstracts.EmployeeDeleteService;
import com.tobeto.bootcampProject.business.abstracts.EmployeeService;
import com.tobeto.bootcampProject.business.abstracts.EmployeeUpdateService;
import com.tobeto.bootcampProject.business.request.create.employee.EmployeeCreateRequest;
import com.tobeto.bootcampProject.business.request.get.EmployeeGetByEmailRequest;
import com.tobeto.bootcampProject.business.request.update.employee.EmployeeUpdateRequest;
import com.tobeto.bootcampProject.entities.Employee;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeCreateService employeeCreateService;
    private EmployeeService employeeService;
    private EmployeeUpdateService employeeUpdateService;
    private EmployeeDeleteService employeeDeleteService;

    @PostMapping
    public Employee createEmployee(
            @RequestBody final EmployeeCreateRequest employeeCreateRequest
    ) {
        return employeeCreateService.createEmployee(employeeCreateRequest);
    }

    @GetMapping("/employee/{employeeId}")
    public Employee getEmployeeById(
            @PathVariable("employeeId") final Integer employeeId
    ) {
        return employeeService.getById(employeeId);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAll();
    }

    @PutMapping("/employee/{employeeId}")
    public Employee updateEmployeeById(
            @PathVariable("employeeId") final Integer employeeId,
            @RequestBody final EmployeeUpdateRequest employeeUpdateRequest
    ) {
        return employeeUpdateService.updateEmployee(employeeId,employeeUpdateRequest);
    }


    @DeleteMapping("/employee/{employeeId}")
    public void deleteEmployeeById(
            @PathVariable("employeeId") final Integer employeeId
    ) {
        employeeDeleteService.deleteEmployeeById(employeeId);
    }

    @GetMapping("/email")
    public Employee getEmployeeById(
            @RequestBody final EmployeeGetByEmailRequest employeeGetByEmailRequest
    ) {
        return employeeService.getEmployeeByEmail(employeeGetByEmailRequest.getEmail());
    }
}
