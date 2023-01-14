package com.example.books.service;


import com.example.books.entity.Book;
import com.example.books.entity.Genre;
import com.example.books.repository.BookRepository;
import com.example.books.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenreService {

    @Autowired
    private GenreRepository genreRepository;


    public List<Genre> getAllGenres() {
        return this.genreRepository.findAll();
    }


    public Optional<Genre> getGenreById(Long id) {
        return this.genreRepository.findById(id);
    }


    public Genre save(Genre genre) {
        return genreRepository.save(genre);
    }


}

