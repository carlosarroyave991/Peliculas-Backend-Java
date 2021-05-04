package com.animeflv.animegratis.infraestructura.controlador;

import com.animeflv.animegratis.aplicacion.comando.ComandoComment;
import com.animeflv.animegratis.aplicacion.manejador.comment.*;
import com.animeflv.animegratis.aplicacion.manejador.view.ManejadorEliminarView;
import com.animeflv.animegratis.dominio.modelo.Comment;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/comments")
public class ComentarioController {
    private ManejadorActualizarComment manejadorActualizarComment;
    private ManejadorCrearComment manejadorCrearComment;
    private ManejadorListarComment manejadorListarComment;
    private ManejadorListarPorIdComment manejadorListarPorIdComment;
    private ManejadorEliminarComment manejadorEliminarComment;

    @GetMapping
    public ResponseEntity<List<Comment>> getAll(){
        return new ResponseEntity<>(manejadorListarComment.ejecutar(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Comment>> findById(@PathVariable("id") int commentId){
        return new ResponseEntity<>(manejadorListarPorIdComment.ejecutar(commentId), HttpStatus.OK);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Comment> save(@RequestBody ComandoComment comandoComment){
        comandoComment.setCreationDate(LocalDateTime.now());
        return new ResponseEntity<>(manejadorCrearComment.ejecutar(comandoComment), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Comment> update(@RequestBody ComandoComment comandoComment, @PathVariable("id") int commentId){
        comandoComment.setCreationDate(LocalDateTime.now());
        return new ResponseEntity<>(manejadorActualizarComment.ejecutar(comandoComment, commentId), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int commmentId){
        manejadorEliminarComment.ejecutar(commmentId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
