package com.example.demo_example.repository.entity;

import com.example.demo_example.dto.PersonDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {

    @Id
    private Integer id;
    @Column(name = "PERSON_NAME", nullable = false)
    private String name;

    public Person(String name, Integer id){
        this.name = name;
        this.id = id;
    }

    public Person(){
    }

    public Person(PersonDTO person) {
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
