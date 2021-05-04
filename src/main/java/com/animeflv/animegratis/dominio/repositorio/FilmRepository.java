package com.animeflv.animegratis.dominio.repositorio;

import com.animeflv.animegratis.dominio.modelo.Film;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface FilmRepository {
    List<Film> getAll();
    Optional<Film> findById(int filmId);
    Film save(Film film);
    void delete(int filmId);
    Film update(Film film, int filmId);
    Optional<Film> findByName(String Name);
    Page<Film> findAll(Pageable pageable);
}
