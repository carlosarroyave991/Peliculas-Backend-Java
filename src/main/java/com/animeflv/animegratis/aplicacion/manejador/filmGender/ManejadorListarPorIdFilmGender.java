package com.animeflv.animegratis.aplicacion.manejador.filmGender;


import com.animeflv.animegratis.dominio.modelo.FilmGender;
import com.animeflv.animegratis.dominio.servicio.FilmGenderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@AllArgsConstructor
@Component
public class ManejadorListarPorIdFilmGender {
    private FilmGenderService filmGenderService;

    public Optional<FilmGender> ejecutar(int filmGenderId){
        return filmGenderService.findById(filmGenderId);
    }
}
