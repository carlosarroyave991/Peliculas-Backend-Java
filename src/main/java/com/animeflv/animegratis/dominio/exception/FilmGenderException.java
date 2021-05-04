package com.animeflv.animegratis.dominio.exception;

public class FilmGenderException extends RuntimeException{
    private static final Long serialVerionUID = 1L;

    public FilmGenderException(String mensaje){
        super(mensaje);
    }
}
