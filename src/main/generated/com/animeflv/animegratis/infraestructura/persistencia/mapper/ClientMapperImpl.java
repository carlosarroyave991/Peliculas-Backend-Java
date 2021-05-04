package com.animeflv.animegratis.infraestructura.persistencia.mapper;

import com.animeflv.animegratis.dominio.modelo.Client;
import com.animeflv.animegratis.infraestructura.persistencia.entidad.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-05-04T17:36:17-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.10 (Oracle Corporation)"
)
@Component
public class ClientMapperImpl implements ClientMapper {

    @Override
    public Client toClient(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        Client client = new Client();

        if ( cliente.getId() != null ) {
            client.setClientId( cliente.getId() );
        }
        client.setName( cliente.getNombre() );
        client.setLastname( cliente.getApellido() );
        client.setNickname( cliente.getApodo() );
        client.setEmail( cliente.getCorreo() );
        client.setPassword( cliente.getContrasena() );
        if ( cliente.getEstado() != null ) {
            client.setActive( cliente.getEstado() );
        }
        client.setCreationDate( cliente.getFechaCreacion() );

        return client;
    }

    @Override
    public List<Client> toClients(List<Cliente> clientes) {
        if ( clientes == null ) {
            return null;
        }

        List<Client> list = new ArrayList<Client>( clientes.size() );
        for ( Cliente cliente : clientes ) {
            list.add( toClient( cliente ) );
        }

        return list;
    }

    @Override
    public Cliente toCliente(Client client) {
        if ( client == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        cliente.setId( client.getClientId() );
        cliente.setNombre( client.getName() );
        cliente.setApellido( client.getLastname() );
        cliente.setApodo( client.getNickname() );
        cliente.setCorreo( client.getEmail() );
        cliente.setContrasena( client.getPassword() );
        cliente.setEstado( client.isActive() );
        cliente.setFechaCreacion( client.getCreationDate() );

        return cliente;
    }
}
