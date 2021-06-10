package com.trustrace.mapstructdemo.mapper;

import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-10T12:40:42+0530",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.11 (Ubuntu)"
)
@Component
public class EmployeeMapperTwoImpl implements EmployeeMapperTwo {

    @Autowired
    private ContactMapper contactMapper;

    @Override
    public EmployeeDtoTwo mapEmployeeToDto(EmployeeTwo employeeTwo) {
        if ( employeeTwo == null ) {
            return null;
        }

        EmployeeDtoTwo employeeDtoTwo = new EmployeeDtoTwo();

        employeeDtoTwo.setId( employeeTwo.getId() );
        employeeDtoTwo.setName( employeeTwo.getName() );
        if ( employeeTwo.getStatus() != null ) {
            employeeDtoTwo.setStatus( Boolean.parseBoolean( employeeTwo.getStatus() ) );
        }
        employeeDtoTwo.setContact( contactMapper.mapContactToDto( employeeTwo.getContact() ) );

        return employeeDtoTwo;
    }

    @Override
    public EmployeeTwo mapDtoToEmployee(EmployeeDtoTwo employeeDtoTwo) {
        if ( employeeDtoTwo == null ) {
            return null;
        }

        EmployeeTwo employeeTwo = new EmployeeTwo();

        employeeTwo.setId( employeeDtoTwo.getId() );
        employeeTwo.setName( employeeDtoTwo.getName() );
        employeeTwo.setStatus( String.valueOf( employeeDtoTwo.isStatus() ) );
        employeeTwo.setContact( contactMapper.mapDtoToContact( employeeDtoTwo.getContact() ) );

        return employeeTwo;
    }
}
