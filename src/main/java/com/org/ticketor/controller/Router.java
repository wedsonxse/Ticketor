package com.org.ticketor.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

public interface Router <T> {
    ResponseEntity<Optional<T>> findById(Long id);
    ResponseEntity<List<T>> findAll();
    void save(T entity);
    void deleteById(Long id);
}
