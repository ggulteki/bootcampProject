package com.tobeto.bootcampProject.business.request.create.employee;

import com.tobeto.bootcampProject.business.request.create.user.UserCreateRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeCreateRequest extends UserCreateRequest {
    private String position;
}
