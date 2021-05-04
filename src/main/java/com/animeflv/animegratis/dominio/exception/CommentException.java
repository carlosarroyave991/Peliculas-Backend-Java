package com.animeflv.animegratis.dominio.exception;

public class CommentException extends RuntimeException{
    private static final Long serialVerionUID = 1L;

    public CommentException(String mensaje){
        super(mensaje);
    }
}
