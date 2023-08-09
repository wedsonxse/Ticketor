package com.org.ticketor.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class MusicGenre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "genres")
    private Set<Band> bands;
}
