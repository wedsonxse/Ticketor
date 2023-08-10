package com.org.ticketor.controller;

import com.org.ticketor.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/artists")
@RestController
public class ArtistController {
    private final ArtistService service;
    @Autowired
    public ArtistController(ArtistService service){
        this.service = service;
    }

}
