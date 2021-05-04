package com.animeflv.animegratis.aplicacion.manejador.client;

import com.animeflv.animegratis.aplicacion.comando.ComandoClient;
import com.animeflv.animegratis.aplicacion.fabrica.FabricaClient;
import com.animeflv.animegratis.dominio.modelo.Client;
import com.animeflv.animegratis.dominio.servicio.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ManejadorCrearClient {
    private ClientService clientService;
    private FabricaClient fabricaClient;

    public Client ejecutar(ComandoClient comandoClient){
        Client client = fabricaClient.crear(comandoClient);
        return clientService.save(client);
    }
}
