package com.trustrace.mapstructdemo.exampleThree.mapper;

import com.trustrace.mapstructdemo.exampleThree.model.dto.EmployeeDtoThree;
import com.trustrace.mapstructdemo.exampleThree.model.entity.EmployeeThree;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-10T15:19:34+0530",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.11 (Ubuntu)"
)
@Component
public class EmployeeMapperThreeImpl extends EmployeeMapperThree {

    @Override
    public EmployeeDtoThree mapEmployeeToDto(EmployeeThree employeeThree) {
        if ( employeeThree == null ) {
            return null;
        }

        EmployeeDtoThree employeeDtoThree = new EmployeeDtoThree();

        if ( employeeThree.getId() != null ) {
            employeeDtoThree.setId( employeeThree.getId() );
        }
        if ( employeeThree.getName() != null ) {
            employeeDtoThree.setName( employeeThree.getName() );
        }

        employeeDtoThree.setStatus( getStatusForDto(employeeThree) );

        return employeeDtoThree;
    }

    @Override
    public EmployeeThree mapDtoToEmployee(EmployeeDtoThree employeeDtoThree) {
        if ( employeeDtoThree == null ) {
            return null;
        }

        EmployeeThree employeeThree = new EmployeeThree();

        if ( employeeDtoThree.getId() != null ) {
            employeeThree.setId( employeeDtoThree.getId() );
        }
        if ( employeeDtoThree.getName() != null ) {
            employeeThree.setName( employeeDtoThree.getName() );
        }

        employeeThree.setStatus( getStatusForEntity(employeeDtoThree) );

        return employeeThree;
    }
}
