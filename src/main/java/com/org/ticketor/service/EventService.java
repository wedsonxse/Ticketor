package com.org.ticketor.service;

import com.org.ticketor.model.Band;
import com.org.ticketor.model.Event;
import com.org.ticketor.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    private final EventRepository repository;

    @Autowired
    public EventService(EventRepository repository) {
        this.repository = repository;
    }

    public Optional<Event> findEventById(Long id){
        return this.repository.findById(id);
    }

    public void createEvent(Event event){
        this.repository.save(event);
    }

    public List<Event> findAllEvents(){
        return this.repository.findAll();
    };

    public void deleteEventById(Long id){
        this.repository.deleteById(id);
    }
}
