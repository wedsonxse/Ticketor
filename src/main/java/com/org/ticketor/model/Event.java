package com.org.ticketor.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "event")

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    //owner
}
