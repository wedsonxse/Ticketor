package com.org.ticketor.service;

import com.org.ticketor.repository.MusicGenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicGenreService  {
    private final MusicGenreRepository repository;

    @Autowired
    public MusicGenreService(MusicGenreRepository repository) {
        this.repository = repository;
    }
}
