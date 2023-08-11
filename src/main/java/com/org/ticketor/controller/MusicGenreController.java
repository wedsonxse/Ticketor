package com.org.ticketor.controller;

import com.org.ticketor.model.MusicGenre;
import com.org.ticketor.service.BandService;
import com.org.ticketor.service.MusicGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api/musicGenres")
@RestController
public class MusicGenreController implements Router<MusicGenre>{
    private final MusicGenreService service;
    @Autowired
    public MusicGenreController(MusicGenreService service){
        this.service = service;
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Optional<MusicGenre>> findById(Long id) {
        return ResponseEntity.ok(this.service.findMusicGenreById(id));
    }

    @Override
    @GetMapping
    public ResponseEntity<List<MusicGenre>> findAll() {
        return ResponseEntity.ok(this.service.findAllMusicGenres());
    }

    @Override
    @PostMapping
    public void save(@RequestBody MusicGenre entity) {
        this.service.createMusicGenre(entity);
    }

    @Override
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        this.service.deleteMusicGenreById(id);
    }
}
