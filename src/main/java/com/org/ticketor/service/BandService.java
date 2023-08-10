package com.org.ticketor.service;

import com.org.ticketor.model.Artist;
import com.org.ticketor.model.Band;
import com.org.ticketor.repository.BandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BandService {
    private final BandRepository repository;

    @Autowired
    public BandService(BandRepository repository) {
        this.repository = repository;
    }

    public Optional<Band> findBandById(Long id){
        return this.repository.findById(id);
    }

    public void createBand(Band band){
        this.repository.save(band);
    }

    public List<Band> findAllBands(){
        return this.repository.findAll();
    };

    public void deleteBandById(Long id){
        this.repository.deleteById(id);
    }
}
