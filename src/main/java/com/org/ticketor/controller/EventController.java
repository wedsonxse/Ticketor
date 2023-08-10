package com.org.ticketor.controller;

import com.org.ticketor.service.BandService;
import com.org.ticketor.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/events")
@RestController
public class EventController {
    private final EventService service;
    @Autowired
    public EventController(EventService service){
        this.service = service;
    }
}
