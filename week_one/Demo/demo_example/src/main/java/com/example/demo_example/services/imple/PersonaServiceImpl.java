package com.example.demo_example.services.imple;

import com.example.demo_example.dto.PersonDTO;
import com.example.demo_example.repository.IPersonaRepository;
import com.example.demo_example.repository.entity.Person;
import com.example.demo_example.services.IPersonService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonaServiceImpl implements IPersonService {

    private final IPersonaRepository repository;

    public PersonaServiceImpl(IPersonaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(PersonDTO person) {
        repository.save(new Person(person));
    }

    @Override
    public String update(PersonDTO person) {
        Optional<Person> value = repository.findById(person.getId());
        if(value.isEmpty()){
            repository.save(new Person(person));
            return "Update";
        } else {
            return "No exist";
        }
    }

    @Override
    public List<PersonDTO> getAll() {
        List<Person> list = (List<Person>) repository.findAll();

        return list.stream()
                .map(PersonDTO::new)
                .collect(Collectors.toList());
    }
}
