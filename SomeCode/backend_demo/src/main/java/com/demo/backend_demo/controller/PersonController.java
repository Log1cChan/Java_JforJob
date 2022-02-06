package com.demo.backend_demo.controller;


import com.demo.backend_demo.model.domain.Person;
import com.demo.backend_demo.model.dto.PersonDTO;
import com.demo.backend_demo.repository.PersonRepository;
import com.demo.backend_demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="person")
public class PersonController {
    /**
     * @program: backend_demo
     * @description: Controller
     * @author: Log1c
     * @create: 2022-01-29 22:54
     **/
    @Autowired
    private PersonService personService;

    @PostMapping(path = "addPerson")
    public void addPerson(Person person){
        personService.addPerson(PersonDTO.from(person));
    }

    @GetMapping(path = "getPerson")
    public Person getPerson(String name){
        PersonDTO personDTO = personService.getPerson(name);
        return PersonDTO.to(personDTO);
    }

    @PostMapping(path = "updatePerson")
    public Person updatePerson(Person person){
        PersonDTO personDTO = PersonDTO.from(person);
        personDTO = personService.updatePerson(personDTO);
        return PersonDTO.to(personDTO);
    }

    @DeleteMapping(path = "deletePerson")
    public Person deletePerson(String name){
        PersonDTO personDTO = personService.deletePerson(name);
        return PersonDTO.to(personDTO);
    }



}
