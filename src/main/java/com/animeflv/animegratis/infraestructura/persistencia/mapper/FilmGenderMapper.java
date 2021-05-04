package com.animeflv.animegratis.infraestructura.persistencia.mapper;

import com.animeflv.animegratis.dominio.modelo.FilmGender;
import com.animeflv.animegratis.infraestructura.persistencia.entidad.PeliculaGenero;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", uses = {GenderMapper.class})
public interface FilmGenderMapper {
    @Mappings({
            @Mapping(source = "id", target = "filmGenderId"),
            @Mapping(source = "peliculaId",target = "filmId"),
            @Mapping(source = "generoId",target = "genderId"),
    })
    FilmGender toFilmGender(PeliculaGenero PeliculaGenero);

    @InheritInverseConfiguration
    @Mapping(target = "pelicula", ignore = true)
    PeliculaGenero toPeliculaGenero(FilmGender filmGender);
}
