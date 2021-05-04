package com.animeflv.animegratis.dominio.repositorio;

import com.animeflv.animegratis.dominio.modelo.FilmGender;

import java.util.Optional;

public interface FilmGenderRepository {
    FilmGender save(FilmGender filmGender);
    void delete(int filmGenderId);
    Optional<FilmGender> findById(int filmGenderId);
}
