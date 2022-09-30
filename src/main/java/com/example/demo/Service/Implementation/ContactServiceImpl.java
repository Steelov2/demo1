package com.example.demo.Service.Implementation;

import com.example.demo.Model.Contact;
import com.example.demo.Service.ContactService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ContactServiceImpl implements ContactService{
    @Override
    public Boolean saveMessageDetails (Contact contact) {
        log.info(contact.toString());
        return true;
    }


}
