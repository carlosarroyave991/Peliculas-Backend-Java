package com.animeflv.animegratis.aplicacion.manejador.film;

import com.animeflv.animegratis.dominio.modelo.Film;
import com.animeflv.animegratis.dominio.servicio.FilmService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ManejadorPaginarFilm {
    private FilmService filmService;

    public Page<Film> ejecutar(Pageable pageable){
        return filmService.findAll(pageable);
    }
}
