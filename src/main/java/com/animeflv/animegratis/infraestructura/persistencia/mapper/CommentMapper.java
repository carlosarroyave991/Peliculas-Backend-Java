package com.animeflv.animegratis.infraestructura.persistencia.mapper;

import com.animeflv.animegratis.dominio.modelo.Comment;
import com.animeflv.animegratis.infraestructura.persistencia.entidad.Comentario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ClientMapper.class, FilmMapper.class})
public interface CommentMapper {
    @Mappings({
            @Mapping(source = "id",target = "commentId"),
            @Mapping(source = "comentario",target = "comment"),
            @Mapping(source = "peliculaId",target = "filmId"),
            @Mapping(source = "clienteId", target = "clientId"),
            @Mapping(source = "fechaCreacion", target = "creationDate"),
    })
    Comment toComment(Comentario comentario);
    List<Comment> toComments(List<Comentario> comentarios);

    @InheritInverseConfiguration
    @Mapping(target = "pelicula", ignore = true)
    Comentario toComentario(Comment comment);

}
