package com.org.ticketor.model;

import jakarta.persistence.*;

@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String function;

    @ManyToOne
    @JoinColumn(name = "band_id")
    private Band band;
}
