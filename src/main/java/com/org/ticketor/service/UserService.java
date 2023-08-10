package com.org.ticketor.service;

import com.org.ticketor.model.Ticket;
import com.org.ticketor.model.User;
import com.org.ticketor.repository.TicketRepository;
import com.org.ticketor.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public Optional<User> findUserById(Long id){
        return this.repository.findById(id);
    }

    public void createUser(User user){
        this.repository.save(user);
    }

    public List<User> findAllUsers(){
        return this.repository.findAll();
    };

    public void deleteUserById(Long id){
        this.repository.deleteById(id);
    }

}
