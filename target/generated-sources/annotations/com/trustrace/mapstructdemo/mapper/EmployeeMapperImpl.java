package com.trustrace.mapstructdemo.mapper;

import com.trustrace.mapstructdemo.exampleOne.mapper.EmployeeMapper;
import com.trustrace.mapstructdemo.exampleOne.model.dto.EmployeeDto;
import com.trustrace.mapstructdemo.exampleOne.model.entity.Employee;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-10T12:37:10+0530",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.11 (Ubuntu)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeDto mapToDto(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setRole( employee.getDesignation() );
        employeeDto.setId( employee.getId() );
        employeeDto.setName( employee.getName() );
        if ( employee.getStatus() != null ) {
            employeeDto.setStatus( Boolean.parseBoolean( employee.getStatus() ) );
        }

        return employeeDto;
    }

    @Override
    public Employee mapDtoToEmployee(EmployeeDto employeeDto) {
        if ( employeeDto == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setDesignation( employeeDto.getRole() );
        employee.setId( employeeDto.getId() );
        employee.setName( employeeDto.getName() );
        employee.setStatus( String.valueOf( employeeDto.isStatus() ) );

        return employee;
    }
}
