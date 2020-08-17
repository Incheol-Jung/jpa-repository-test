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

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/items", produces = "application/json")
public class ItemController {

    @PersistenceUnit
    EntityManagerFactory entityManagerFactory;

    @Autowired
    ItemService itemService;

//    @GetMapping(value = "")
//    public List<ItemResponse> get() {
//        List<Item> items2ghh =  itemService.get();
////        Item firstItem = items.get(0);
////
////        System.out.println("==============================================");
////        System.out.println("firstItem.getPerson().getName() == " + firstItem.getPerson().getName());
//
//        //        firstItem.setItemName("contoller change");
//        //        List<Item> items2 =  itemService.get();
//
//        return items2.stream()
//                    .map(item -> new ItemResponse(item.getId(), item.getItemName()))
//                    .collect(Collectors.toList());
//    }

    @GetMapping(value = "/test")

    @Transactional
    public List<Item> get2() {
        List<Item> items =  itemService.get();
        for(Item item : items){
            System.out.println(item.getPerson().getName());
            System.out.println("isLoaded = " + entityManagerFactory.getPersistenceUnitUtil().isLoaded(item.getPerson()));
        }

        List<Item> items2 = itemService.get();
        return items2;
    }

}
