package com.startup.intern.demo.service;

import com.startup.intern.demo.repository.PersonRepository;
import com.startup.intern.demo.repository.entity.Person;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person getPersonById(int id) {
        return personRepository.findById(id);
    }

    public int getAge(Person person) {
        LocalDate personDate = person.getBirthdate();

        return Period.between(personDate, LocalDate.now()).getYears();
    }
}
