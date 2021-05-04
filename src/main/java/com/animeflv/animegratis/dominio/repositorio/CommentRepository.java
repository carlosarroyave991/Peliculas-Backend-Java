package com.animeflv.animegratis.dominio.repositorio;

import com.animeflv.animegratis.dominio.modelo.Comment;

import java.util.List;
import java.util.Optional;

public interface CommentRepository {
    List<Comment> getAll();
    Comment save(Comment comment);
    Comment update(Comment comment, int commentId);
    void delete(int commentId);
    Optional<Comment> findById(int commentId);
}
