package com.example.jparepositorytest.model;

import com.example.jparepositorytest.entity.Person;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class ItemResponse {
    private int id;
    private String itemName;
    private Person person;

    public ItemResponse(int id, String itemName) {
        this.id = id;
        this.itemName = itemName;
//        this.person = person;
    }
}
