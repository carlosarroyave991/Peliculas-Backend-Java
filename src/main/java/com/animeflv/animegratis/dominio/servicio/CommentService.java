package com.animeflv.animegratis.dominio.servicio;

import com.animeflv.animegratis.dominio.exception.CommentException;
import com.animeflv.animegratis.dominio.modelo.Comment;
import com.animeflv.animegratis.dominio.repositorio.CommentRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class CommentService {
    private final static String ID_NO_ENCONTRADO = "El id no fue encontrado";
    private final static String ID_YA_EXISTE = "El id ya se encuentra en la base de datos";
    private CommentRepository commentRepository;

    public List<Comment> getAll(){
        return commentRepository.getAll();
    }

    public Optional<Comment> findById(int commentId){
        Optional<Comment> comment = commentRepository.findById(commentId);
        if(comment.isPresent()){
            return commentRepository.findById(commentId);
        }else{
            throw new CommentException(ID_NO_ENCONTRADO);
        }
    }

    public Comment save(Comment comment){
        Optional<Comment> result = commentRepository.findById(comment.getCommentId());
        if(result.isPresent()){
            throw new CommentException(ID_YA_EXISTE);
        }else{
            return commentRepository.save(comment);
        }
    }

    public Comment update(Comment comment, int commentId){
        Optional<Comment> result = commentRepository.findById(comment.getCommentId());
        if (result.isPresent()) {
            return commentRepository.update(comment, commentId);
        }else{
            throw new CommentException(ID_NO_ENCONTRADO);
        }
    }

    public void delete(int commentId){
        Optional<Comment> comment = commentRepository.findById(commentId);
        if(comment.isPresent()){
            commentRepository.delete(commentId);
        }else{
            throw new CommentException(ID_NO_ENCONTRADO);
        }
    }


}
