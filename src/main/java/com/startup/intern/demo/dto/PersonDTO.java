package com.startup.intern.demo.dto;

public class PersonDTO {
    private String name;
    private String lastname;
    private int age;

    public PersonDTO(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }
}
