package com.animeflv.animegratis.aplicacion.manejador.client;

import com.animeflv.animegratis.aplicacion.comando.ComandoClient;
import com.animeflv.animegratis.aplicacion.fabrica.FabricaClient;
import com.animeflv.animegratis.dominio.modelo.Client;
import com.animeflv.animegratis.dominio.servicio.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ManejadorActualizarClient {
    private ClientService clientService;
    private FabricaClient fabricaClient;

    public Client ejecutar(ComandoClient comandoClient, int clientId){
        Client client = fabricaClient.crear(comandoClient);
        return clientService.update(client, clientId);
    }
}
