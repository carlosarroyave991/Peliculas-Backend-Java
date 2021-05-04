package com.animeflv.animegratis.dominio.servicio;



import com.animeflv.animegratis.dominio.exception.FilmGenderException;
import com.animeflv.animegratis.dominio.modelo.FilmGender;
import com.animeflv.animegratis.dominio.repositorio.FilmGenderRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class FilmGenderService {
    private final static String ID_YA_EXISTE = "El id ya existe en la base de datos";
    private final static String ID_NO_ENCONTRADO = "El id no fue encontrado";
    private FilmGenderRepository filmGenderRepository;

    public Optional<FilmGender> findById(int filmGenderId) {
        Optional<FilmGender> filmGender = filmGenderRepository.findById(filmGenderId);
        if (filmGender.isPresent()) {
            return filmGenderRepository.findById(filmGenderId);
        } else {
            throw new FilmGenderException(ID_NO_ENCONTRADO);
        }
    }

    public FilmGender save(FilmGender filmGender){
        Optional<FilmGender> result = filmGenderRepository.findById(filmGender.getFilmGenderId());
        if(result.isPresent()){
            throw new FilmGenderException(ID_YA_EXISTE);
        }else{
            return filmGenderRepository.save(filmGender);
        }
    }

    public void delete(int filmGenderId){
        Optional<FilmGender> filmGender = filmGenderRepository.findById(filmGenderId);
        if(filmGender.isPresent()){
            filmGenderRepository.delete(filmGenderId);
        }else{
            throw new FilmGenderException(ID_NO_ENCONTRADO);
        }
    }
}

