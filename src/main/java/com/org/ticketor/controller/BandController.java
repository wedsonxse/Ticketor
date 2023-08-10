package com.org.ticketor.controller;

import com.org.ticketor.model.Band;
import com.org.ticketor.service.ArtistService;
import com.org.ticketor.service.BandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api/bands")
@RestController
public class BandController implements  Router<Band>{
    private final BandService service;
    @Autowired
    public BandController(BandService service){
        this.service = service;
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Band>> findById(Long id) {
        return ResponseEntity.ok(this.service.findBandById(id));
    }

    @Override
    @GetMapping
    public ResponseEntity<List<Band>> findAll() {
        return ResponseEntity.ok(this.service.findAllBands());
    }

    @Override
    @PostMapping
    public void save(Band entity) {
        this.service.createBand(entity);
    }

    @Override
    @DeleteMapping("/{id}")
    public void deleteById(Long id) {
        this.service.deleteBandById(id);
    }
}
