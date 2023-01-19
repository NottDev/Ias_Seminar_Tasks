package com.example.demo_example.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {

    @Id
    private Integer PersonId;
    @Column(name = "PERSON_NAME", nullable = false)
    private String name;

    public Integer getPersonId() {
        return PersonId;
    }

    public void setPersonId(Integer personId) {
        PersonId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
