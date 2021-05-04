package com.animeflv.animegratis.dominio.exception;

public class FilmException extends RuntimeException{
    private static final Long serialVerionUID = 1L;

    public FilmException(String mensaje){
        super(mensaje);
    }
}
