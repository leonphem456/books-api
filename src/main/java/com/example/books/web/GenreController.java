package com.example.books.web;

import com.example.books.entity.Book;
import com.example.books.entity.Genre;
import com.example.books.service.BookService;
import com.example.books.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping(path = "/genres", produces = MediaType.APPLICATION_JSON_VALUE)
public class GenreController {
    @Autowired
    private GenreService genreService;

    @GetMapping(path = "all-genres")
    public List<Genre> getAllBooks() {
        return this.genreService.getAllGenres();
    }

    @GetMapping(path = "id/{id}")
    public Optional<Genre> getGenreById(@PathVariable("id") Long id) {
        return this.genreService.getGenreById(id);
    }

    @RequestMapping(value = "/add")
    public Genre add(@RequestBody Genre genre) {

        return genreService.save(genre);
    }

}
