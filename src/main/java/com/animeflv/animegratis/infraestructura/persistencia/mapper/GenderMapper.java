package com.animeflv.animegratis.infraestructura.persistencia.mapper;

import com.animeflv.animegratis.dominio.modelo.Gender;
import com.animeflv.animegratis.infraestructura.persistencia.entidad.Genero;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GenderMapper {
    @Mappings({
            @Mapping(source = "id", target = "genderId"),
            @Mapping(source = "nombre",target = "name"),
            @Mapping(source = "fechaCreacion",target = "creationDate"),
    })
    Gender toGender(Genero genero);
    List<Gender> toGenders(List<Genero> generos);

    @InheritInverseConfiguration
    Genero toGenero(Gender gender);
}
