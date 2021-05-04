package com.animeflv.animegratis.aplicacion.manejador.comment;

import com.animeflv.animegratis.dominio.servicio.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ManejadorEliminarComment {
    private CommentService commentService;

    public void ejecutar(int commentId){
        commentService.delete(commentId);
    }
}
