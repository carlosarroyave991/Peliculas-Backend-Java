package com.animeflv.animegratis.dominio.exception;

public class GenderException extends RuntimeException{
    private static final Long serialVerionUID = 1L;

    public GenderException(String mensaje){
        super(mensaje);
    }
}
