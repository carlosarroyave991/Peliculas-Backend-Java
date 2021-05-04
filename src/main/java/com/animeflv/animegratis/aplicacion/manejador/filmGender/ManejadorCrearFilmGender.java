package com.animeflv.animegratis.aplicacion.manejador.filmGender;

import com.animeflv.animegratis.aplicacion.comando.ComandoFilmGender;
import com.animeflv.animegratis.aplicacion.fabrica.FabricaFilmGender;
import com.animeflv.animegratis.dominio.modelo.FilmGender;
import com.animeflv.animegratis.dominio.servicio.FilmGenderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ManejadorCrearFilmGender {
    private FilmGenderService filmGenderService;
    private FabricaFilmGender fabricaFilmGender;

    public FilmGender ejecutar(ComandoFilmGender comandoFilmGender){
        FilmGender filmGender = fabricaFilmGender.crear(comandoFilmGender);
        return filmGenderService.save(filmGender);
    }
}
