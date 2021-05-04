package com.animeflv.animegratis.aplicacion.fabrica;

import com.animeflv.animegratis.dominio.modelo.Client;
import com.animeflv.animegratis.aplicacion.comando.ComandoClient;
import org.springframework.stereotype.Component;

@Component
public class FabricaClient {
    public Client crear(ComandoClient comandoClient){
        return new Client(comandoClient.getClientId(), comandoClient.getName(), comandoClient.getLastname(), comandoClient.getNickname(), comandoClient.getEmail(), comandoClient.getPassword(), comandoClient.isActive(), comandoClient.getCreationDate());
    }
}
