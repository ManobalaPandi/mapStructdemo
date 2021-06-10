package com.trustrace.mapstructdemo.exampleTwo.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
    private String emailId;
    private Double phoneNumber;
}
