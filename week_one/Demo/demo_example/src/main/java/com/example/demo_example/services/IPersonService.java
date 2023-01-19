package com.example.demo_example.services;

import com.example.demo_example.dto.PersonDTO;

import java.util.List;

public interface IPersonService {
    void save(PersonDTO person);
    String update(PersonDTO person);
    List<PersonDTO> getAll();
}
