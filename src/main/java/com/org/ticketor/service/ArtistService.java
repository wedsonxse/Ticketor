package com.org.ticketor.service;

import com.org.ticketor.model.Artist;
import com.org.ticketor.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistService {
    private final ArtistRepository repository;

    @Autowired
    public ArtistService(ArtistRepository repository) {
        this.repository = repository;
    }

    public Optional<Artist> findArtistById(Long id){
        return this.repository.findById(id);
    }

    public void createArtist(Artist artist){
        this.repository.save(artist);
    }

    public List<Artist> findAllArtists(){
        return this.repository.findAll();
    };

    public void deleteArtistById(Long id){
        this.repository.deleteById(id);
    }
}
