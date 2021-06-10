package com.trustrace.mapstructdemo.exampleOne.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    private Integer id;
    private String name;
    private String role;
    private boolean status;

}
