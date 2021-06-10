package com.trustrace.mapstructdemo.exampleTwo.mapper;

import com.trustrace.mapstructdemo.exampleTwo.model.dto.EmployeeDtoTwo;
import com.trustrace.mapstructdemo.exampleTwo.model.entity.EmployeeTwo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",
        uses = {
                ContactMapper.class
        }
)
public interface EmployeeMapperTwo {


    EmployeeDtoTwo mapEmployeeToDto (EmployeeTwo employeeTwo);

    @InheritInverseConfiguration
    EmployeeTwo mapDtoToEmployee(EmployeeDtoTwo employeeDtoTwo);
}
