package com.animeflv.animegratis.aplicacion.fabrica;

import com.animeflv.animegratis.aplicacion.comando.ComandoFilmGender;
import com.animeflv.animegratis.dominio.modelo.FilmGender;
import org.springframework.stereotype.Component;

@Component
public class FabricaFilmGender {
    public FilmGender crear(ComandoFilmGender comandoFilmGender){
        return new FilmGender(comandoFilmGender.getFilmGenderId(), comandoFilmGender.getFilmId(), comandoFilmGender.getGenderId(), comandoFilmGender.getGender());
    }
}
