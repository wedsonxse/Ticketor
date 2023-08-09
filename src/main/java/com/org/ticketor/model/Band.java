package com.org.ticketor.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Band {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "band",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Artist> artists;


    @ManyToMany(mappedBy = "bands")
    private Set<Event> events;

    @ManyToMany
    @JoinTable(
            name = "bands_genres",
            joinColumns = @JoinColumn(name = "band_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private Set<MusicGenre> genres;
}
