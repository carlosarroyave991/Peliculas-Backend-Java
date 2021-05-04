package com.animeflv.animegratis.infraestructura.persistencia.mapper;


import com.animeflv.animegratis.infraestructura.persistencia.entidad.Vista;
import com.animeflv.animegratis.dominio.modelo.View;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.InheritInverseConfiguration;

@Mapper(componentModel = "spring", uses = {FilmMapper.class, ClientMapper.class})
public interface ViewMapper {
    @Mappings({
            @Mapping(source = "id",target = "viewId"),
            @Mapping(source = "clienteId",target = "clientId"),
            @Mapping(source = "peliculaId",target = "filmId"),
    })
    View toView(Vista vista);

    @InheritInverseConfiguration
    @Mapping(target = "pelicula",ignore = true)
    Vista toVista(View view);
}
