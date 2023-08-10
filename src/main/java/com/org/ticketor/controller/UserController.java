package com.org.ticketor.controller;

import com.org.ticketor.model.User;
import com.org.ticketor.service.BandService;
import com.org.ticketor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api/users")
@RestController
public class UserController implements  Router<User>{
    private final UserService service;
    @Autowired
    public UserController(UserService service){
        this.service = service;
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(this.service.findUserById(id));
    };

    @Override
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(this.service.findAllUsers());
    }

    @Override
    @PostMapping
    public void save(@RequestBody User entity) {
        this.service.createUser(entity);
    }

    @Override
    @DeleteMapping("/{id}")
    public void deleteById(Long id) {
        this.service.deleteUserById(id);
    }
}
