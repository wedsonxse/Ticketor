package com.org.ticketor.service;

import com.org.ticketor.model.MusicGenre;
import com.org.ticketor.model.Ticket;
import com.org.ticketor.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketService {
    private final TicketRepository repository;

    @Autowired
    public TicketService(TicketRepository repository) {
        this.repository = repository;
    }

    public Optional<Ticket> findTicketById(Long id){
        return this.repository.findById(id);
    }

    public void createTicket(Ticket ticket){
        this.repository.save(ticket);
    }

    public List<Ticket> findAllTickets(){
        return this.repository.findAll();
    };

    public void deleteTicketById(Long id){
        this.repository.deleteById(id);
    }
}
