package com.startup.intern.demo.controller;

import com.startup.intern.demo.dto.PersonDTO;
import com.startup.intern.demo.repository.entity.Person;
import com.startup.intern.demo.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/{id}")
    public PersonDTO getPersonById(@PathVariable int id) {
        Person p = personService.getPersonById(id);
        int pAge = personService.getAge(p);

        return new PersonDTO(p.getName(), p.getLastname(), pAge);
    }
}
