package com.animeflv.animegratis.dominio.repositorio;


import com.animeflv.animegratis.dominio.modelo.Client;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;

public interface ClientRepository {
    List<Client> getAll();//Obtener todos los clientes o lista de clientes
    Optional<Client> findById(int ClientId); //Opcionalmente me envie un cliente por el Id
    Client save(Client client); //guardar informacion del cliente
    void delete(int clientId);//Borrar cliente por Id
    Client update(Client client, int clientId); //Actualizar Cliente
    Optional<Client> findByNickname(String nickname); //Buscar cliente por nickname
    Page<Client> findAll(Pageable pageable);//paginar los clientes
}
