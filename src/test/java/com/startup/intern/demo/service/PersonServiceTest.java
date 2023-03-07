package com.startup.intern.demo.service;

import com.startup.intern.demo.repository.PersonRepository;
import com.startup.intern.demo.repository.entity.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.time.LocalDate;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

@SpringBootTest
class PersonServiceTest {
    @Autowired
    private PersonService personService;

    @MockBean
    private PersonRepository personRepository;

    @Test
    public void getById_ValidData() {
        doReturn(new Person("Сергій", "Жадан", LocalDate.of(1974, 8, 23)))
                .when(personRepository)
                .findById(1);
        Person p = personService.getPersonById(1);

        Assertions.assertNotNull(p);
        Assertions.assertEquals(p.getName(), "Сергій");
        Assertions.assertEquals(p.getLastname(), "Жадан");
        Assertions.assertEquals(p.getBirthdate(), LocalDate.of(1974, 8, 23));

        Mockito.verify(personRepository, times(1)).findById(1);
    }

    @Test
    void shouldReturnCorrectAge() {
        Person person = new Person("", "", LocalDate.of(2000, 1, 1));

        Assertions.assertEquals(23, personService.getAge(person));
    }

    @Test
    void shouldFailTestOnCorrectAge() {
        Person person = new Person("", "", LocalDate.of(2000, 1, 1));

        Assertions.assertNotEquals(22, personService.getAge(person));
    }
}