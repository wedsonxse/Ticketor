package com.org.ticketor.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Set;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int capacity;
    private String city;

    private Date start;
    private Date end;

    @ManyToMany
    @JoinTable(
            name = "events_bands",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "band_id")
    )
    private Set<Band> bands;

    //owner
}
