package com.animeflv.animegratis.dominio.exception;

public class ViewException extends RuntimeException{
    private static final Long serialVerionUID = 1L;

    public ViewException(String mensaje){
        super(mensaje);
    }
}
