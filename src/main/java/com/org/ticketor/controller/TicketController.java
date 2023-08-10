package com.org.ticketor.controller;

import com.org.ticketor.model.Ticket;
import com.org.ticketor.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api/tickets")
@RestController
public class TicketController implements Router<Ticket>{
    private final TicketService service;
    @Autowired
    public TicketController(TicketService service){
        this.service = service;
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Ticket>> findById(Long id) {
        return ResponseEntity.ok(this.service.findTicketById(id));
    }

    @Override
    @GetMapping
    public ResponseEntity<List<Ticket>> findAll() {
        return ResponseEntity.ok(this.service.findAllTickets());
    }

    @Override
    @PostMapping
    public void save(Ticket entity) {
        this.service.createTicket(entity);
    }

    @Override
    @DeleteMapping("/{id}")
    public void deleteById(Long id) {
        this.service.deleteTicketById(id);
    }
}
