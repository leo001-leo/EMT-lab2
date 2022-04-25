package com.example.emt_lab2.service;

import com.example.emt_lab2.model.Author;
import com.example.emt_lab2.model.Country;
import com.example.emt_lab2.model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    Optional<Author> findById(Long id);
    Optional<Author> create(String name, String surname, Long country);
    List<Author> listAll();
}
