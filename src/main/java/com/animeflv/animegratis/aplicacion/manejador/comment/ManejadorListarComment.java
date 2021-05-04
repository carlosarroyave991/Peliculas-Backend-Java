package com.animeflv.animegratis.aplicacion.manejador.comment;

import com.animeflv.animegratis.dominio.modelo.Comment;
import com.animeflv.animegratis.dominio.servicio.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class ManejadorListarComment {
    private CommentService commentService;

    public List<Comment> ejecutar(){
        return commentService.getAll();
    }
}
