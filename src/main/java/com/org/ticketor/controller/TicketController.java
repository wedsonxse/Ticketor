package com.org.ticketor.controller;

import com.org.ticketor.service.BandService;
import com.org.ticketor.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/tickets")
@RestController
public class TicketController {
    private final TicketService service;
    @Autowired
    public TicketController(TicketService service){
        this.service = service;
    }
}
