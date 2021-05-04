package com.animeflv.animegratis.aplicacion.fabrica;

import com.animeflv.animegratis.aplicacion.comando.ComandoComment;
import com.animeflv.animegratis.dominio.modelo.Comment;
import org.springframework.stereotype.Component;

@Component
public class FabricaComment {
    public Comment crear(ComandoComment comandoComment){
        return new Comment(comandoComment.getCommentId(), comandoComment.getComment(), comandoComment.getClientId(), comandoComment.getFilmId(), comandoComment.getCreationDate(), comandoComment.getFilm(), comandoComment.getClient());
    }
}
