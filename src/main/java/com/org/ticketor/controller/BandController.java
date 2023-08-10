package com.org.ticketor.controller;

import com.org.ticketor.service.ArtistService;
import com.org.ticketor.service.BandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/bands")
@RestController
public class BandController {
    private final BandService service;
    @Autowired
    public BandController(BandService service){
        this.service = service;
    }
}
