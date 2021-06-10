package com.trustrace.mapstructdemo.exampleThree.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeThree {

    private Integer id;
    private String name;
    private boolean status;

}
