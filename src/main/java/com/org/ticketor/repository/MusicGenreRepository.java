package com.org.ticketor.repository;

import com.org.ticketor.model.MusicGenre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicGenreRepository extends JpaRepository<MusicGenre,Long> {
}
