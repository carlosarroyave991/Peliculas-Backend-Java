package com.animeflv.animegratis.dominio.servicio;

import com.animeflv.animegratis.dominio.exception.GenderException;
import com.animeflv.animegratis.dominio.modelo.Gender;
import com.animeflv.animegratis.dominio.repositorio.GenderRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenderService {
    private final static String ID_YA_EXISTE = "El id ya existe en la base de datos";
    private final static String ID_NO_ENCONTRADO = "El id no fue encontrado";
    private final static String NOMBRE_NO_ENCONTRADO = "El nombre no fue encontrado";
    private GenderRepository genderRepository;

    public List<Gender> getAll(){
        return genderRepository.getAll();
    }

    public Optional<Gender> findById(int genderId){
        Optional<Gender> gender = genderRepository.findById(genderId);
        if (gender.isPresent()){
            return gender;
        }else{
            throw new GenderException(ID_NO_ENCONTRADO);
        }
    }
    public Optional<Gender> findByName(String name){
        Optional<Gender> gender = genderRepository.findByName(name);
        if (gender.isPresent()){
            return gender;
        }else {
            throw new GenderException(NOMBRE_NO_ENCONTRADO);
        }
    }

    public Gender save(Gender gender){
        Optional<Gender> result = genderRepository.findById(gender.getGenderId());
        if(result.isPresent()){
            throw new GenderException(ID_YA_EXISTE);
        }else{
            return genderRepository.save(gender);
        }
    }

    public Gender update(Gender gender,int genderId){
        Optional<Gender> result = genderRepository.findById(genderId);
        if(result.isPresent()){
            return genderRepository.update(gender, genderId);
        }else{
            throw new GenderException(ID_YA_EXISTE);
        }
    }

    public void delete(int genderId){
        Optional<Gender> gender = genderRepository.findById(genderId);
        if (gender.isPresent()){
            genderRepository.delete(genderId);
        }else{
            throw new GenderException(ID_NO_ENCONTRADO);
        }
    }

    public Page<Gender> findAll(Pageable pageable){
        return genderRepository.findAll(pageable);
    }
}
