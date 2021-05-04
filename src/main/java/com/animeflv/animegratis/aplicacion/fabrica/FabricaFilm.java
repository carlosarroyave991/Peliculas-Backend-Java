package com.animeflv.animegratis.aplicacion.fabrica;

import com.animeflv.animegratis.aplicacion.comando.ComandoFilm;
import com.animeflv.animegratis.dominio.modelo.Film;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class FabricaFilm {
    public Film crear(ComandoFilm comandoFilm){
        return new Film(comandoFilm.getFilmId(), comandoFilm.getDescription(), comandoFilm.getName(), comandoFilm.getImage(), comandoFilm.isActive(), comandoFilm.getReleaseDate(),comandoFilm.getCreationDate(), comandoFilm.getClient(), comandoFilm.getClients(),comandoFilm.getComments(),comandoFilm.getGender(), comandoFilm.getView());
    }
}
