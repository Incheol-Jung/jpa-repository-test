package com.example.jparepositorytest.service;

import com.example.jparepositorytest.dao.PersonRepository;
import com.example.jparepositorytest.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public List<Person> get() {
        return personRepository.findAll();
    }

    public Person save(String name) {
        Person p = new Person(name);
        return personRepository.save(p);
    }
}
