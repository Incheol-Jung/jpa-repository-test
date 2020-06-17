package com.example.jparepositorytest.dao;

import com.example.jparepositorytest.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
