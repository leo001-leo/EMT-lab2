package com.example.emt_lab2.web.controller.rest;

import com.example.emt_lab2.model.Author;
import com.example.emt_lab2.service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/authors")
public class AuthorRestController {
    private final AuthorService authorService;

    public AuthorRestController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    private List<Author> findAll() {
        return this.authorService.listAll();
    }


}
