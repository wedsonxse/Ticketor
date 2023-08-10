package com.org.ticketor.controller;

import com.org.ticketor.model.Event;
import com.org.ticketor.service.BandService;
import com.org.ticketor.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api/events")
@RestController
public class EventController implements Router<Event>{
    private final EventService service;
    @Autowired
    public EventController(EventService service){
        this.service = service;
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Event>> findById(Long id) {
        return ResponseEntity.ok(this.service.findEventById(id));
    }

    @Override
    @GetMapping
    public ResponseEntity<List<Event>> findAll() {
        return ResponseEntity.ok(this.service.findAllEvents());
    }

    @Override
    @PostMapping
    public void save(@RequestBody Event entity) {
        this.service.createEvent(entity);
    }

    @Override
    @DeleteMapping("/{id}")
    public void deleteById(Long id) {
        this.service.deleteEventById(id);
    }
}
