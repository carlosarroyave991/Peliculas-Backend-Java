package com.animeflv.animegratis.dominio.servicio;

import com.animeflv.animegratis.dominio.exception.ClientException;
import com.animeflv.animegratis.dominio.modelo.Client;
import com.animeflv.animegratis.dominio.repositorio.ClientRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class ClientService {
    private final static String NICKNAME_YA_EXISTE = "El nickname ya existe en la base de datos";
    private final static String NICKNAME_NO_ENCONTRADO = "El nickname no fue encontrado";
    private final static String ID_NO_ENCONTRADO = "El Id no fue encontrado";
    private final static String ID_YA_EXISTE = "El Id ya existe en la base de datos";
    private ClientRepository clientRepository;

    public List<Client> getAll(){
        return clientRepository.getAll();
    }

    public Optional<Client> findById(int clientId){
        Optional<Client> client = clientRepository.findById(clientId);
        if(client.isPresent()){
            return client;
        }else{
            throw new ClientException(ID_NO_ENCONTRADO);
        }
    }

    public Optional<Client> findByNickname(String nickname){
        Optional<Client> client = clientRepository.findByNickname(nickname);
        if(client.isPresent()){
            return client;
        }else{
            throw new ClientException(NICKNAME_NO_ENCONTRADO);
        }
    }

    public Client save(Client client){
        Optional<Client> result = clientRepository.findByNickname(client.getNickname());
        if(result.isPresent()){
            throw new ClientException(NICKNAME_YA_EXISTE);
        }else {
            return clientRepository.save(client);
        }
    }

    public void delete(int clientId){
        Optional<Client> client = clientRepository.findById(clientId);
        if(client.isPresent()){
            clientRepository.delete(clientId);
        }else{
            throw new ClientException(ID_NO_ENCONTRADO);
        }
    }

    public Client update(Client client, int clientId){
        Optional<Client> result = clientRepository.findById(clientId);
        if (result.isPresent()){
            return clientRepository.update(client, clientId);
        }else{
            throw new ClientException(ID_NO_ENCONTRADO);
        }
    }

    public Page<Client> findAll(Pageable pageable){
        return clientRepository.findAll(pageable);
    }


}
