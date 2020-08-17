package com.example.jparepositorytest.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String itemName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Person person;

    public Item(String itemName) {
        this.itemName = itemName;
    }
}
