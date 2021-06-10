package com.trustrace.mapstructdemo.exampleThree.mapper;

import com.trustrace.mapstructdemo.exampleThree.DemoService;
import com.trustrace.mapstructdemo.exampleThree.model.entity.EmployeeThree;
import com.trustrace.mapstructdemo.exampleThree.model.dto.EmployeeDtoThree;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring",

        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
        )
public abstract class EmployeeMapperThree {

    @Autowired
    DemoService demoService;

    @Mapping(target = "status", expression = "java(getStatusForDto(employeeThree))")
    public abstract EmployeeDtoThree mapEmployeeToDto (EmployeeThree employeeThree);

    String getStatusForDto(EmployeeThree employeeThree) {
      return demoService.getStatusStringValue(employeeThree.isStatus());
    }

    @InheritInverseConfiguration
    @Mapping(target = "status", expression = "java(getStatusForEntity(employeeDtoThree))")
    public abstract EmployeeThree mapDtoToEmployee(EmployeeDtoThree employeeDtoThree);

    boolean getStatusForEntity(EmployeeDtoThree employeeDtoThree) {
        return demoService.getStatusbooleanValue(employeeDtoThree.getStatus());
    }
}
