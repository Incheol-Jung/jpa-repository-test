package com.example.jparepositorytest.service;

import com.example.jparepositorytest.dao.ItemRepository;
import com.example.jparepositorytest.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemRepository itemRepository;

    public List<Item> get() {
        List<Item> items = itemRepository.findAll();

//        items.stream().forEach(item -> {
//            System.out.println("item.getPerson().getName() == " + item.getPerson().getName());
//        });

        return items;
    }
}
