package com.startup.intern.demo.repository;

import com.startup.intern.demo.repository.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    Person findById(int id);
}
