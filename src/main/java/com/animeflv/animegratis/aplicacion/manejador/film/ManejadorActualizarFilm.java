package com.animeflv.animegratis.aplicacion.manejador.film;

import com.animeflv.animegratis.aplicacion.comando.ComandoFilm;
import com.animeflv.animegratis.aplicacion.fabrica.FabricaFilm;
import com.animeflv.animegratis.dominio.modelo.Film;
import com.animeflv.animegratis.dominio.servicio.FilmService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@AllArgsConstructor
@Component
public class ManejadorActualizarFilm {
    private FilmService filmService;
    private FabricaFilm fabricaFilm;

    public Film ejecutar(ComandoFilm comandoFilm, int filmId){
        Film film = fabricaFilm.crear(comandoFilm);
        return filmService.update(film, filmId);
    }
}
