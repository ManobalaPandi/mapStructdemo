package com.trustrace.mapstructdemo.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-10T12:37:44+0530",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.11 (Ubuntu)"
)
@Component
public class ContactMapperImpl implements ContactMapper {

    @Override
    public ContactDto mapContactToDto(Contact contact) {
        if ( contact == null ) {
            return null;
        }

        ContactDto contactDto = new ContactDto();

        contactDto.setEmail( contact.getEmailId() );
        contactDto.setPhoneNumber( contact.getPhoneNumber() );

        return contactDto;
    }

    @Override
    public Contact mapDtoToContact(ContactDto contact) {
        if ( contact == null ) {
            return null;
        }

        Contact contact1 = new Contact();

        contact1.setEmailId( contact.getEmail() );
        contact1.setPhoneNumber( contact.getPhoneNumber() );

        return contact1;
    }
}
