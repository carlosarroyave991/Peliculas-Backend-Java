package com.animeflv.animegratis.aplicacion.manejador.client;

import com.animeflv.animegratis.aplicacion.fabrica.FabricaClient;
import com.animeflv.animegratis.dominio.servicio.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ManejadorEliminarClient {
    private ClientService clientService;
    private FabricaClient fabricaClient;

    public void ejecutar(int clientId){
        clientService.delete(clientId);
    }
}
