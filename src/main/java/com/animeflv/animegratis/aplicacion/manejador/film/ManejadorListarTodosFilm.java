package com.animeflv.animegratis.aplicacion.manejador.film;

import com.animeflv.animegratis.dominio.modelo.Film;
import com.animeflv.animegratis.dominio.servicio.FilmService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class ManejadorListarTodosFilm {
    private FilmService filmService;

    public List<Film> ejecutar(){
        return filmService.getAll();
    }
}
