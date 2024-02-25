package com.tobeto.bootcampProject.business.request.get;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeGetByEmailRequest {

    private String email;
}
