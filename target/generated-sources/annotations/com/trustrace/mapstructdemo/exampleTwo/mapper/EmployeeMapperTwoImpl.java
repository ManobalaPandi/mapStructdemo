package com.trustrace.mapstructdemo.exampleTwo.mapper;

import com.trustrace.mapstructdemo.exampleTwo.model.dto.EmployeeDtoTwo;
import com.trustrace.mapstructdemo.exampleTwo.model.dto.MarkDto;
import com.trustrace.mapstructdemo.exampleTwo.model.entity.EmployeeTwo;
import com.trustrace.mapstructdemo.exampleTwo.model.entity.Mark;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-10T15:19:34+0530",
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
        employeeDtoTwo.setMark( markListToMarkDtoList( employeeTwo.getMark() ) );

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
        employeeTwo.setMark( markDtoListToMarkList( employeeDtoTwo.getMark() ) );

        return employeeTwo;
    }

    protected MarkDto markToMarkDto(Mark mark) {
        if ( mark == null ) {
            return null;
        }

        MarkDto markDto = new MarkDto();

        markDto.setScore( mark.getScore() );

        return markDto;
    }

    protected List<MarkDto> markListToMarkDtoList(List<Mark> list) {
        if ( list == null ) {
            return null;
        }

        List<MarkDto> list1 = new ArrayList<MarkDto>( list.size() );
        for ( Mark mark : list ) {
            list1.add( markToMarkDto( mark ) );
        }

        return list1;
    }

    protected Mark markDtoToMark(MarkDto markDto) {
        if ( markDto == null ) {
            return null;
        }

        Mark mark = new Mark();

        mark.setScore( markDto.getScore() );

        return mark;
    }

    protected List<Mark> markDtoListToMarkList(List<MarkDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Mark> list1 = new ArrayList<Mark>( list.size() );
        for ( MarkDto markDto : list ) {
            list1.add( markDtoToMark( markDto ) );
        }

        return list1;
    }
}
