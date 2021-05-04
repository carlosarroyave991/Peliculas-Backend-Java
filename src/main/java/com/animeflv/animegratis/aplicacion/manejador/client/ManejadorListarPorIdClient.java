package com.animeflv.animegratis.aplicacion.manejador.client;

import com.animeflv.animegratis.dominio.modelo.Client;
import com.animeflv.animegratis.dominio.servicio.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@AllArgsConstructor
@Component
public class ManejadorListarPorIdClient {
    private ClientService clientService;
    public Optional<Client> ejecutar(int clientId){
        return clientService.findById(clientId);
    }
}
