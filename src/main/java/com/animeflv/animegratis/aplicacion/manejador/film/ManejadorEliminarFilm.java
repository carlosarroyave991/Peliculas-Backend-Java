package com.animeflv.animegratis.aplicacion.manejador.film;


import com.animeflv.animegratis.dominio.servicio.FilmService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ManejadorEliminarFilm {
    private FilmService filmService;

    public void ejecutar(int filmId){
        filmService.delete(filmId);
    }
}
