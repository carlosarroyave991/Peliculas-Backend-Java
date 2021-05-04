package com.animeflv.animegratis.infraestructura.persistencia.mapper;

import com.animeflv.animegratis.dominio.modelo.Client;
import com.animeflv.animegratis.infraestructura.persistencia.entidad.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {
@Mappings({
        @Mapping(source = "id", target = "clientId"),
        //@Mapping(source="documento",target = "document"),
        @Mapping(source = "nombre", target = "name"),
        @Mapping(source = "apellido", target = "lastname"),
        @Mapping(source = "apodo", target = "nickname"),
        @Mapping(source = "correo", target = "email"),
        @Mapping(source = "contrasena", target = "password"),
        @Mapping(source = "estado", target = "active"),
        @Mapping(source = "fechaCreacion", target = "creationDate"),
})
Client toClient(Cliente cliente);
    List<Client> toClients(List<Cliente> clientes);

    @InheritInverseConfiguration
    Cliente toCliente(Client client);

}
