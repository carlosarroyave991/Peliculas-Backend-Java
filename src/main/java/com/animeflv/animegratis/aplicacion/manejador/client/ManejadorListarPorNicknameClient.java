package com.animeflv.animegratis.aplicacion.manejador.client;

import com.animeflv.animegratis.dominio.modelo.Client;
import com.animeflv.animegratis.dominio.servicio.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@AllArgsConstructor
@Component
public class ManejadorListarPorNicknameClient {
    private ClientService clientService;

    public Optional<Client> ejecutar(String nickname){
        return clientService.findByNickname(nickname);
    }
}
