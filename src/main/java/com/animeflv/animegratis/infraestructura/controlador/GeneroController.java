package com.animeflv.animegratis.infraestructura.controlador;

import com.animeflv.animegratis.aplicacion.comando.ComandoGender;
import com.animeflv.animegratis.aplicacion.manejador.gender.*;
import com.animeflv.animegratis.dominio.modelo.Gender;
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
@RequestMapping("/genders")
public class GeneroController {
    private ManejadorActualizarGender manejadorActualizarGender;
    private ManejadorCrearGender manejadorCrearGender;
    private ManejadorEliminarGender manejadorEliminarGender;
    private ManejadorListarPorIdGender manejadorListarPorIdGender;
    private ManejadorListarTodosGender manejadorListarTodosGender;
    private ManejadorListarPorNameGender manejadorListarPorNameGender;
    private ManejadorPaginarGender manejadorPaginarGender;

    @GetMapping
    public ResponseEntity<List<Gender>> getAll(){
        return new ResponseEntity<>(manejadorListarTodosGender.ejecutar(), HttpStatus.OK);
    }

    @GetMapping("/paginator")
    public ResponseEntity<Page<Gender>> findAll(Pageable pageable){
        return new ResponseEntity<>(manejadorPaginarGender.ejecutar(pageable), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Gender>> findById(@PathVariable("id") int genderId){
        return new ResponseEntity<>(manejadorListarPorIdGender.ejecutar(genderId), HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<Optional<Gender>> findByName(@PathVariable("name")  String name){
        return new ResponseEntity<>(manejadorListarPorNameGender.ejecutar(name), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Gender> save(@RequestBody ComandoGender comandoGender){
        comandoGender.setCreationDate(LocalDateTime.now());
        return new ResponseEntity<>(manejadorCrearGender.ejecutar(comandoGender), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Gender> update(@RequestBody ComandoGender comandoGender, @PathVariable("id") int genderId){
        comandoGender.setGenderId(genderId);
        return new ResponseEntity<>(manejadorActualizarGender.ejecutar(comandoGender, genderId), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int genderId){
        manejadorEliminarGender.ejecutar(genderId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
