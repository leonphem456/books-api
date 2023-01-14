package com.example.books.repository;

import com.example.books.entity.Author;
import com.example.books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}