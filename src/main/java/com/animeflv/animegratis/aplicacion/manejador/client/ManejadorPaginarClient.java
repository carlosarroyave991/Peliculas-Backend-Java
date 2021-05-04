package com.animeflv.animegratis.aplicacion.manejador.client;

import com.animeflv.animegratis.dominio.modelo.Client;
import com.animeflv.animegratis.dominio.servicio.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ManejadorPaginarClient {
    private ClientService clientService;

    public Page<Client> ejecutar(Pageable pageable){
        return clientService.findAll(pageable);
    }
}
