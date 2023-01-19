package com.example.demo_example.controllers;

import com.example.demo_example.dto.PersonDTO;
import com.example.demo_example.services.IPersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final IPersonService iPersonService;

    public PersonController(IPersonService iPersonService) {
        this.iPersonService = iPersonService;
    }

    @GetMapping()
    public ResponseEntity<?> getPersonAll(){

        return ResponseEntity
                .ok()
                .body(iPersonService.getAll());
    }

    @PostMapping()
    public ResponseEntity<?>
    savePerson(@RequestBody PersonDTO person){
        return new ResponseEntity<>( iPersonService.update(person), HttpStatus.CREATED);
    }

    @PutMapping()

}
