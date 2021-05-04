package com.animeflv.animegratis.aplicacion.manejador.filmGender;


import com.animeflv.animegratis.dominio.servicio.FilmGenderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ManejadorEliminarFilmGender {
    private FilmGenderService filmGenderService;

    public void ejecutar(int filmGenderId){
        filmGenderService.delete(filmGenderId);
    }
}
