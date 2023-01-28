package com.example.books.service;


import com.example.books.entity.Book;
import com.example.books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;


    public List<Book> getAllBooks() {
        return this.bookRepository.findAll();
    }


    public Optional<Book> getBookById(Long id) {
        return this.bookRepository.findById(id);
    }


    public Book save(Book book) {
        return bookRepository.save(book);
    }


    public List<Book> findByGenre(Long genreId) {
        return this.bookRepository.findByGenreId(genreId);
    }
}

