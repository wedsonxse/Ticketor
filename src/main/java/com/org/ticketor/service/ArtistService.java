package com.org.ticketor.service;

import com.org.ticketor.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtistService {
    private final ArtistRepository repository;

    @Autowired
    public ArtistService(ArtistRepository repository) {
        this.repository = repository;
    }
}
