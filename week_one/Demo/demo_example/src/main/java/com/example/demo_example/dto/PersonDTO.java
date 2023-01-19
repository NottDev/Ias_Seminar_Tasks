package com.example.demo_example.dto;

import com.example.demo_example.repository.entity.Person;

public class PersonDTO {

    private Integer id;
    private String name;

    public PersonDTO(){
    }

    public PersonDTO(Person person) {
        this.name = getName();
        this.id = getId();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
