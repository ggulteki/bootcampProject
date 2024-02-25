package com.tobeto.bootcampProject.business.request.update.employee;

import com.tobeto.bootcampProject.business.request.update.user.UserUpdateRequest;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeUpdateRequest extends UserUpdateRequest {

    private String position;
}
