package com.demo.backend_demo.service;


import com.demo.backend_demo.model.dto.PersonDTO;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

public interface PersonService {
    /**
     * @program: backend_demo
     * @description: interface
     * @author: Log1c
     * @create: 2022-01-29 22:56
     **/

    void addPerson(PersonDTO personDTO);
    PersonDTO getPerson(String name);
    @Transactional
    PersonDTO deletePerson(String name);
    PersonDTO updatePerson(PersonDTO personDTO);
}
