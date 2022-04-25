package com.example.emt_lab2.repository;

import com.example.emt_lab2.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    void deleteBookByName(String name);
}
