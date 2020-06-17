package com.example.jparepositorytest.dao;

import com.example.jparepositorytest.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
