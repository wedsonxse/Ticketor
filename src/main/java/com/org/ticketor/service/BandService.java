package com.org.ticketor.service;

import com.org.ticketor.repository.BandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BandService {
    private final BandRepository repository;

    @Autowired
    public BandService(BandRepository repository) {
        this.repository = repository;
    }
}
