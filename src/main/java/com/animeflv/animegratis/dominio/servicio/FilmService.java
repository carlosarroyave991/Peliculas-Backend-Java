package com.animeflv.animegratis.dominio.servicio;

import com.animeflv.animegratis.dominio.exception.ClientException;
import com.animeflv.animegratis.dominio.exception.FilmException;
import com.animeflv.animegratis.dominio.modelo.Film;
import com.animeflv.animegratis.dominio.repositorio.FilmRepository;
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
public class FilmService {
    private final static String ID_YA_EXISTE = "El id ya existe en la base de datos";
    private final static String ID_NO_ENCONTRADO = "El id no fue encontrado";
    private final static String NOMBRE_NO_ENCONTRADO = "El nombre no fue encontrado";
    private final static String NOMBRE_YA_EXISTE = "El nombre ya existe en la base de datos";
    private FilmRepository filmRepository;

    public List<Film> getAll(){
        return filmRepository.getAll();
    }

    public Optional<Film> findById(int filmId){
        Optional<Film> film = filmRepository.findById(filmId);
        if(film.isPresent()){
            return film;
        }else{
            throw new FilmException(ID_NO_ENCONTRADO);
        }
    }

    public Film save(Film film){
        Optional<Film> result = filmRepository.findById(film.getFilmId());
        if (result.isPresent()){
            throw new FilmException(ID_YA_EXISTE);
        }else{
            return filmRepository.save(film);
        }
    }

    public Film update(Film film,int filmId){
        Optional<Film> result = filmRepository.findById(filmId);
        if (result.isPresent()){
            return filmRepository.update(film, filmId);
        }else{
            throw new FilmException(ID_NO_ENCONTRADO);
        }
    }

    public void delete(int filmId){
        Optional<Film> film = filmRepository.findById(filmId);
        if(film.isPresent()){
            filmRepository.delete(filmId);
        }else{
            throw new FilmException(ID_NO_ENCONTRADO);
        }
    }

    public Optional<Film> findByName(String name){
        Optional<Film> film = filmRepository.findByName(name);
        if (film.isPresent()){
            return film;
        }else{
            throw new FilmException(NOMBRE_NO_ENCONTRADO);
        }
    }

    public Page<Film> findAll(Pageable pageable){
        return filmRepository.findAll(pageable);
    }
}
