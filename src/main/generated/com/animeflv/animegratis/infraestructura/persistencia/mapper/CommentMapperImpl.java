package com.animeflv.animegratis.infraestructura.persistencia.mapper;

import com.animeflv.animegratis.dominio.modelo.Comment;
import com.animeflv.animegratis.infraestructura.persistencia.entidad.Comentario;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-28T15:35:48-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.10 (Oracle Corporation)"
)
@Component
public class CommentMapperImpl implements CommentMapper {

    @Override
    public Comment toComment(Comentario comentario) {
        if ( comentario == null ) {
            return null;
        }

        Comment comment = new Comment();

        if ( comentario.getId() != null ) {
            comment.setCommentId( comentario.getId() );
        }
        comment.setComment( comentario.getComentario() );
        if ( comentario.getPeliculaId() != null ) {
            comment.setFilmId( comentario.getPeliculaId() );
        }
        if ( comentario.getClienteId() != null ) {
            comment.setClientId( comentario.getClienteId() );
        }
        comment.setCreationDate( comentario.getFechaCreacion() );

        return comment;
    }

    @Override
    public List<Comment> toComments(List<Comentario> comentarios) {
        if ( comentarios == null ) {
            return null;
        }

        List<Comment> list = new ArrayList<Comment>( comentarios.size() );
        for ( Comentario comentario : comentarios ) {
            list.add( toComment( comentario ) );
        }

        return list;
    }

    @Override
    public Comentario toComentario(Comment comment) {
        if ( comment == null ) {
            return null;
        }

        Comentario comentario = new Comentario();

        comentario.setId( comment.getCommentId() );
        comentario.setComentario( comment.getComment() );
        comentario.setPeliculaId( comment.getFilmId() );
        comentario.setClienteId( comment.getClientId() );
        comentario.setFechaCreacion( comment.getCreationDate() );

        return comentario;
    }
}
