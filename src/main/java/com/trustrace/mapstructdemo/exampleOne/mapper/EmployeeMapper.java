package com.trustrace.mapstructdemo.exampleOne.mapper;

import com.trustrace.mapstructdemo.exampleOne.model.dto.EmployeeDto;
import com.trustrace.mapstructdemo.exampleOne.model.entity.Employee;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring"
//        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface EmployeeMapper {

    @Mapping(target = "role", source = "designation")
    EmployeeDto mapToDto (Employee employee);

    @InheritInverseConfiguration
    Employee mapDtoToEmployee(EmployeeDto employeeDto);
}
