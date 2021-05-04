package com.animeflv.animegratis.aplicacion.manejador.client;

import com.animeflv.animegratis.dominio.modelo.Client;
import com.animeflv.animegratis.dominio.servicio.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class ManejadorListarTodosClient {
    private ClientService clientService;

    public List<Client> ejecutar(){
        return clientService.getAll();
    }
}
