package com.animeflv.animegratis.aplicacion.manejador.film;


import com.animeflv.animegratis.dominio.modelo.Film;
import com.animeflv.animegratis.dominio.servicio.FilmService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@AllArgsConstructor
@Component
public class ManejadorListarPorIdFilm {
    private FilmService filmService;

    public Optional<Film> ejecutar(int filmId){
      return  filmService.findById(filmId);
    }
}
