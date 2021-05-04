package com.animeflv.animegratis.aplicacion.manejador.comment;

import com.animeflv.animegratis.dominio.modelo.Comment;
import com.animeflv.animegratis.dominio.servicio.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@AllArgsConstructor
@Component
public class ManejadorListarPorIdComment {
    private CommentService commentService;

    public Optional<Comment> ejecutar(int commentId){
        return commentService.findById(commentId);
    }
}
