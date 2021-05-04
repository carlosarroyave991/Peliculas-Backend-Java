package com.animeflv.animegratis.aplicacion.manejador.comment;

import com.animeflv.animegratis.aplicacion.comando.ComandoComment;
import com.animeflv.animegratis.aplicacion.fabrica.FabricaComment;
import com.animeflv.animegratis.dominio.modelo.Comment;
import com.animeflv.animegratis.dominio.servicio.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ManejadorActualizarComment {
    private CommentService commentService;
    private FabricaComment fabricaComment;

    public Comment ejecutar(ComandoComment comandoComment, int commentId){
        Comment comment = fabricaComment.crear(comandoComment);
        return commentService.update(comment,commentId);
    }
}
