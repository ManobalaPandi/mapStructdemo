package com.trustrace.mapstructdemo.exampleThree.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDtoThree {

    private Integer id;
    private String name;
    private String status;

}
