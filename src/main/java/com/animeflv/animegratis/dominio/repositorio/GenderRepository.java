package com.animeflv.animegratis.dominio.repositorio;

import com.animeflv.animegratis.dominio.modelo.Gender;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface GenderRepository {
    List<Gender> getAll();
    Optional<Gender> findById(int genderId);
    Gender save(Gender gender);
    Gender update(Gender gender, int genderId);
    void delete(int genderId);
    Optional<Gender> findByName(String name);
    Page<Gender> findAll(Pageable pageable);
}
