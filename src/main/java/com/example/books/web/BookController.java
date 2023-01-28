package com.example.books.web;

import com.example.books.entity.Book;
import com.example.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping(path = "/books", produces = MediaType.APPLICATION_JSON_VALUE)
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping(path = "all-books")
    public List<Book> getAllBooks() {
        return this.bookService.getAllBooks();
    }

    @GetMapping(path = "findByGenre/{genreId}")
    public List<Book> findByGenre(@PathVariable("genreId") Long genreId) {
        return this.bookService.findByGenre(genreId);
    }

    @GetMapping(path = "id/{id}")
    public Optional<Book> getBookById(@PathVariable("id") Long id) {
        return this.bookService.getBookById(id);
    }

    @RequestMapping(value = "/add")
    public Book add(@RequestBody Book book) {
        return bookService.save(book);
    }


}
