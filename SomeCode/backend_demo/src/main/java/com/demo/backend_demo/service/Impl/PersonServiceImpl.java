package com.demo.backend_demo.service.Impl;

import com.demo.backend_demo.model.db.PersonDb;
import com.demo.backend_demo.model.dto.PersonDTO;
import com.demo.backend_demo.repository.PersonRepository;
import com.demo.backend_demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public void addPerson(PersonDTO personDTO) {
        personRepository.save(PersonDb.from(PersonDTO.to(personDTO)));
    }

    @Override
    public PersonDTO getPerson(String name) {
        PersonDb personDb = (PersonDb)personRepository.findPersonByName(name);
        return PersonDTO.from(PersonDb.to(personDb));
    }

    @Override
    public PersonDTO deletePerson(String name) {
        PersonDb personDb = (PersonDb)personRepository.findPersonByName(name);
        personRepository.delete(personDb);
        return PersonDTO.from(PersonDb.to(personDb));
    }

    @Override
    public PersonDTO updatePerson(PersonDTO personDTO) {
        PersonDb personDb = (PersonDb)personRepository.findPersonById(personDTO.getId());
        personDb.setName(personDTO.getName());
        personDb.setEmail(personDTO.getEmail());
        personRepository.save(personDb);
        return PersonDTO.from(PersonDb.to(personDb));
    }
    /**
     * @program: backend_demo
     * @description: Impl
     * @author: Log1c
     * @create: 2022-01-29 22:57
     **/


}
