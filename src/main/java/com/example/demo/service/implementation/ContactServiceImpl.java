package com.example.demo.service.implementation;

import com.example.demo.model.Contact;
import com.example.demo.service.ContactService;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@Getter
@Setter
@Slf4j
//@RequestScope
//@SessionScope
@ApplicationScope
public class ContactServiceImpl implements ContactService {
    private int counter = 0;

    public ContactServiceImpl() {
        System.out.println("Contact Service bean is created");
    }

    @Override
    public Boolean saveMessageDetails(Contact contact) {
        log.info(contact.toString());
        return true;
    }


}
