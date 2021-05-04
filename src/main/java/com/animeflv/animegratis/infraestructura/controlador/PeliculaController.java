package com.animeflv.animegratis.infraestructura.controlador;

import com.animeflv.animegratis.aplicacion.comando.ComandoFilm;
import com.animeflv.animegratis.aplicacion.manejador.film.*;
import com.animeflv.animegratis.dominio.modelo.Client;
import com.animeflv.animegratis.dominio.modelo.Film;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/films")
public class PeliculaController {
    private ManejadorActualizarFilm manejadorActualizarFilm;
    private ManejadorCrearFilm manejadorCrearFilm;
    private ManejadorListarTodosFilm manejadorListarTodosFilm;
    private ManejadorListarPorIdFilm manejadorListarPorIdFilm;
    private ManejadorListarPorNameFilm manejadorListarPorNameFilm;
    private ManejadorEliminarFilm manejadorEliminarFilm;
    private ManejadorPaginarFilm manejadorPaginarFilm;

    @GetMapping
    public ResponseEntity<List<Film>> getAll(){
        return new ResponseEntity<>(manejadorListarTodosFilm.ejecutar(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Film>> findById(@PathVariable("id") int filmId){
        return new ResponseEntity<>(manejadorListarPorIdFilm.ejecutar(filmId), HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<Optional<Film>> findByName(@PathVariable("name") String name){
        return new ResponseEntity<>(manejadorListarPorNameFilm.ejecutar(name), HttpStatus.OK);
    }

    @GetMapping("/paginator")
    public ResponseEntity<Page<Film>> findAll(Pageable pageable){
        return new ResponseEntity<>(manejadorPaginarFilm.ejecutar(pageable), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Film> save(@RequestBody ComandoFilm comandoFilm){
        comandoFilm.setActive(true);
        comandoFilm.setCreationDate(LocalDateTime.now());
        return new ResponseEntity<>(manejadorCrearFilm.ejecutar(comandoFilm), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Film> update(@RequestBody ComandoFilm comandoFilm, @PathVariable("id") int filmId){
        comandoFilm.setFilmId(filmId);
        return new ResponseEntity<>(manejadorActualizarFilm.ejecutar(comandoFilm, filmId), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int filmId){
        manejadorEliminarFilm.ejecutar(filmId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
