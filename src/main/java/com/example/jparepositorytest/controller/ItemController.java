package com.example.jparepositorytest.controller;

import com.example.jparepositorytest.entity.Item;
import com.example.jparepositorytest.entity.Person;
import com.example.jparepositorytest.service.ItemService;
import com.example.jparepositorytest.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/items", produces = "application/json")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping(value = "")
    public List<Item> get() {
        List<Item> items =  itemService.get();
//        Item firstItem = items.get(0);

//        System.out.println("firstItem.getPerson().getName() == " + firstItem.getPerson().getName());

        return items;
    }

}
