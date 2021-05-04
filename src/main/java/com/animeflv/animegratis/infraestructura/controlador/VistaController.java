package com.animeflv.animegratis.infraestructura.controlador;

import com.animeflv.animegratis.aplicacion.comando.ComandoView;
import com.animeflv.animegratis.aplicacion.manejador.view.ManejadorCrearView;
import com.animeflv.animegratis.aplicacion.manejador.view.ManejadorEliminarView;
import com.animeflv.animegratis.aplicacion.manejador.view.ManejadorListarPorIdView;
import com.animeflv.animegratis.dominio.modelo.View;
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
@RequestMapping("/views")
public class VistaController {
    private ManejadorListarPorIdView manejadorListarPorIdView;
    private ManejadorCrearView manejadorCrearView;
    private ManejadorEliminarView manejadorEliminarView;

    @GetMapping("/{id}")
    public ResponseEntity<Optional<View>> findById(@PathVariable("id") int viewId){
        return new ResponseEntity<>(manejadorListarPorIdView.ejecutar(viewId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<View> save(@RequestBody ComandoView comandoView){
        return new ResponseEntity<>(manejadorCrearView.ejecutar(comandoView), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int viewId){
        manejadorEliminarView.ejecutar(viewId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
