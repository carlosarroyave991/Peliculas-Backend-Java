package com.animeflv.animegratis.infraestructura.persistencia.mapper;

import com.animeflv.animegratis.dominio.modelo.Film;
import com.animeflv.animegratis.infraestructura.persistencia.entidad.Pelicula;
import org.mapstruct.*;

import java.util.*;

@Mapper(componentModel = "spring")
public interface FilmMapper {
    @Mappings({
            @Mapping(source = "id", target = "filmId"),
            @Mapping(source = "descripcion",target = "description"),
            @Mapping(source = "nombre",target = "name"),
            @Mapping(source = "imagen",target = "image"),
            @Mapping(source = "estado",target = "active"),
            @Mapping(source = "fechaEstreno",target = "releaseDate"),
            @Mapping(source = "fechaCreacion",target = "creationDate"),
    })
    Film toFilm(Pelicula pelicula);
    List<Film> toFilms(List<Pelicula> peliculas);

    @InheritInverseConfiguration
    Pelicula toPelicula(Film film);
}
