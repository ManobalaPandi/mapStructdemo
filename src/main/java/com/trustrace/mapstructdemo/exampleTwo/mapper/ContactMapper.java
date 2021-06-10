package com.trustrace.mapstructdemo.exampleTwo.mapper;

import com.trustrace.mapstructdemo.exampleTwo.model.dto.ContactDto;
import com.trustrace.mapstructdemo.exampleTwo.model.entity.Contact;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ContactMapper {

    @Mapping(target = "email", source = "emailId")
    ContactDto mapContactToDto(Contact contact);

    @InheritInverseConfiguration
    Contact mapDtoToContact(ContactDto contact);
}
