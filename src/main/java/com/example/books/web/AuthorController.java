package com.example.books.web;

import com.example.books.entity.Author;
import com.example.books.entity.Book;
import com.example.books.service.AuthorService;
import com.example.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(path = "/authors", produces = MediaType.APPLICATION_JSON_VALUE)
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping(path = "all-authors")
    public List<Author> getAllAuthors() {
        return this.authorService.getAllAuthors();
    }

    @GetMapping(path = "id/{id}")
    public Optional<Author> getAuthorById(@PathVariable("id") Long id) {
        return this.authorService.getAuthorById(id);
    }

    @PostMapping(value = "/add")
    public Author add(@RequestBody Author author) {

        return authorService.save(author);
    }

}
