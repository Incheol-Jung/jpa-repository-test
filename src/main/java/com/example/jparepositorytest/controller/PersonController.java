package com.example.jparepositorytest.controller;

import com.example.jparepositorytest.entity.Person;
import com.example.jparepositorytest.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/persons", produces = "application/json")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping(value = "")
    public List<Person> get() {
        return personService.get();
    }

    @PostMapping(value = "")
    public Person get(String name) {
        return personService.save(name);
    }
}
