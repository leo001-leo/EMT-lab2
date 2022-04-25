package com.example.emt_lab2.service;

import com.example.emt_lab2.model.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService {
    Optional<Country> findById(Long id);
    Optional<Country> create(String name, String continent);
    List<Country> listAll();
}
