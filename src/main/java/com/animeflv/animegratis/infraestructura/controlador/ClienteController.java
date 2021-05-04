package com.animeflv.animegratis.infraestructura.controlador;

import com.animeflv.animegratis.aplicacion.comando.ComandoClient;
import com.animeflv.animegratis.aplicacion.manejador.client.*;
import com.animeflv.animegratis.dominio.modelo.Client;
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
@RequestMapping("/clients")
public class ClienteController {
    private ManejadorCrearClient manejadorCrearClient;
    private ManejadorActualizarClient manejadorActualizarClient;
    private ManejadorEliminarClient manejadorEliminarClient;
    private ManejadorListarTodosClient manejadorListarTodosClient;
    private ManejadorListarPorIdClient manejadorListarPorIdClient;
    private ManejadorPaginarClient manejadorPaginarClient;
    private ManejadorListarPorNicknameClient manejadorListarPorNicknameClient;

    @GetMapping
    public ResponseEntity<List<Client>> getAll(){
        return new ResponseEntity<>(manejadorListarTodosClient.ejecutar(), HttpStatus.OK);
    }

    @GetMapping("/paginator")
    public ResponseEntity<Page<Client>> findAll(Pageable pageable){
        return new ResponseEntity<>(manejadorPaginarClient.ejecutar(pageable), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Client>> findById(@PathVariable("id") int clientId){
        return new ResponseEntity<>(manejadorListarPorIdClient.ejecutar(clientId), HttpStatus.OK);
    }

    @GetMapping("/{nickname}")
    public ResponseEntity<Optional<Client>> findByNickname(@PathVariable("nickname") String nickname){
        return new ResponseEntity<>(manejadorListarPorNicknameClient.ejecutar(nickname), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Client> save(@RequestBody ComandoClient comandoClient){
        comandoClient.setActive(true);
        comandoClient.setCreationDate(LocalDateTime.now());
        return new ResponseEntity<>(manejadorCrearClient.ejecutar(comandoClient), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> update(@RequestBody ComandoClient comandoClient, @PathVariable("id") int clientId){
        comandoClient.setClientId(clientId);
        return new ResponseEntity<>(manejadorActualizarClient.ejecutar(comandoClient, clientId), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int clientId){
        manejadorEliminarClient.ejecutar(clientId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
