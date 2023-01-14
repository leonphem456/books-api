package com.example.books.service;


import com.example.books.entity.Author;
import com.example.books.entity.Book;
import com.example.books.repository.AuthorRepository;
import com.example.books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;


    public List<Author> getAllAuthors() {
        return this.authorRepository.findAll();
    }


    public Optional<Author> getAuthorById(Long id) {
        return this.authorRepository.findById(id);
    }


    public Author save(Author author) {
        return authorRepository.save(author);
    }


}

