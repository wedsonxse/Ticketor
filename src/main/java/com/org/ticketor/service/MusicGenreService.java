package com.org.ticketor.service;

import com.org.ticketor.model.Event;
import com.org.ticketor.model.MusicGenre;
import com.org.ticketor.repository.MusicGenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusicGenreService  {
    private final MusicGenreRepository repository;

    @Autowired
    public MusicGenreService(MusicGenreRepository repository) {
        this.repository = repository;
    }

    public Optional<MusicGenre> findMusicGenreById(Long id){
        return this.repository.findById(id);
    }

    public void createMusicGenre(MusicGenre genre){
        this.repository.save(genre);
    }

    public List<MusicGenre> findAllMusicGenres(){
        return this.repository.findAll();
    };

    public void deleteMusicGenreById(Long id){
        this.repository.deleteById(id);
    }
}
