package com.example.jparepositorytest.controller;

import com.example.jparepositorytest.entity.Item;
import com.example.jparepositorytest.entity.Person;
import com.example.jparepositorytest.model.ItemResponse;
import com.example.jparepositorytest.service.ItemService;
import com.example.jparepositorytest.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/items", produces = "application/json")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping(value = "")
    public List<ItemResponse> get() {
        List<Item> items =  itemService.get();
        Item firstItem = items.get(0);
//        firstItem.setItemName("contoller change");

        System.out.println("==============================================");
        System.out.println("firstItem.getPerson().getName() == " + firstItem.getPerson().getName());

//        List<Item> items2 =  itemService.get();

        return items.stream()
                    .map(item -> new ItemResponse(item.getId(), item.getItemName()))
                    .collect(Collectors.toList());
    }

}
