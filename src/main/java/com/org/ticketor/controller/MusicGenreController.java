package com.org.ticketor.controller;

import com.org.ticketor.service.BandService;
import com.org.ticketor.service.MusicGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/musicGenres")
@RestController
public class MusicGenreController {
    private final MusicGenreService service;
    @Autowired
    public MusicGenreController(MusicGenreService service){
        this.service = service;
    }
}
