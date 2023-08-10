package com.org.ticketor.controller;

import com.org.ticketor.model.Artist;
import com.org.ticketor.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api/artists")
@RestController
public class ArtistController implements Router<Artist> {
    private final ArtistService service;
    @Autowired
    public ArtistController(ArtistService service){
        this.service = service;
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Artist>> findById(Long id) {
        return ResponseEntity.ok(this.service.findArtistById(id));
    }

    @Override
    @GetMapping
    public ResponseEntity<List<Artist>> findAll() {
        return ResponseEntity.ok(this.service.findAllArtists());
    }

    @Override
    @PostMapping
    public void save(@RequestBody Artist entity) {
        this.service.createArtist(entity);
    }

    @Override
    @DeleteMapping("/{id}")
    public void deleteById(Long id) {
        this.service.deleteArtistById(id);
    }
}
