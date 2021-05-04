package com.animeflv.animegratis.infraestructura.controlador;

import com.animeflv.animegratis.aplicacion.comando.ComandoFilmGender;
import com.animeflv.animegratis.aplicacion.manejador.filmGender.ManejadorCrearFilmGender;
import com.animeflv.animegratis.aplicacion.manejador.filmGender.ManejadorEliminarFilmGender;
import com.animeflv.animegratis.aplicacion.manejador.filmGender.ManejadorListarPorIdFilmGender;
import com.animeflv.animegratis.dominio.modelo.FilmGender;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/filmGenders")
public class PeliculaGenero {
    private ManejadorCrearFilmGender manejadorCrearFilmGender;
    private ManejadorEliminarFilmGender manejadorEliminarFilmGender;
    private ManejadorListarPorIdFilmGender manejadorListarPorIdFilmGender;

    @GetMapping("/{id}")
    public ResponseEntity<Optional<FilmGender>> findById(@PathVariable("id") int filmGenderId){
        return new ResponseEntity<>(manejadorListarPorIdFilmGender.ejecutar(filmGenderId), HttpStatus.OK);
    }

    @PostMapping("/{id}")
    public ResponseEntity<FilmGender> save(@RequestBody ComandoFilmGender comandoFilmGender){
        return new ResponseEntity<>(manejadorCrearFilmGender.ejecutar(comandoFilmGender), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int filmGenderId){
        manejadorEliminarFilmGender.ejecutar(filmGenderId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
