package com.example.books.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "book", schema = "books")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "img")
    private String image;

    @Column(name = "thumb_image")
    private String thumbImage;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "author", referencedColumnName = "id")
    private Author author;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "genre", referencedColumnName = "id")
    private Genre genre;


//    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
//    @JsonManagedReference
//    @JoinTable(name = "book_genre", schema = "books",
//            joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "genre_id", referencedColumnName = "id")
//    )
//    private Set<Genre> genres = new HashSet<>();


}