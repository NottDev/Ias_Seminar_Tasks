package com.example.demo_example.repository;

import com.example.demo_example.repository.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface IPersonaRepository extends CrudRepository<Person, Integer> {
}
