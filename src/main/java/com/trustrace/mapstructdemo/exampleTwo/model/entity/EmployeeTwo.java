package com.trustrace.mapstructdemo.exampleTwo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeTwo {

    private Integer id;
    private String name;
    private String status;

    private Contact contact;

    private List<Mark> mark;

}
