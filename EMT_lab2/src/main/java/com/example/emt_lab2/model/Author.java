package com.example.emt_lab2.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    @ManyToOne
    private com.example.emt_lab2.model.Country country;

    public Author() {

    }

    public Author(String name, String surname, com.example.emt_lab2.model.Country country) {
        this.name = name;
        this.surname = surname;
        this.country = country;
    }
}
