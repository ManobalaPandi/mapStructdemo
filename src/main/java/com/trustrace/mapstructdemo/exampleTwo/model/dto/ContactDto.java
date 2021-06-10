package com.trustrace.mapstructdemo.exampleTwo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactDto {

    private String email;
    private Double phoneNumber;

}
