package com.animeflv.animegratis.infraestructura.error;

import com.animeflv.animegratis.dominio.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.concurrent.ConcurrentHashMap;

@ControllerAdvice
public class ManejadorError extends ResponseEntityExceptionHandler {
    private static final String OCURRIO_ERROR_FAVOR_CONTACTAR_ADMINISTRADOR = "Ocurrio un error, favor contactar al administrador";
    private static final ConcurrentHashMap<String, Integer> CODIGOS_ESTADO = new ConcurrentHashMap<>();

    public ManejadorError(){
        CODIGOS_ESTADO.put(ClientException.class.getSimpleName(), HttpStatus.BAD_REQUEST.value());
        CODIGOS_ESTADO.put(FilmException.class.getSimpleName(),HttpStatus.BAD_REQUEST.value());
        CODIGOS_ESTADO.put(GenderException.class.getSimpleName(), HttpStatus.BAD_REQUEST.value());
        CODIGOS_ESTADO.put(ViewException.class.getSimpleName(), HttpStatus.BAD_REQUEST.value());
        CODIGOS_ESTADO.put(CommentException.class.getSimpleName(), HttpStatus.BAD_REQUEST.value());
        CODIGOS_ESTADO.put(FilmGenderException.class.getSimpleName(), HttpStatus.BAD_REQUEST.value());
    }

    public final ResponseEntity<Error> handleAllExceptions(Exception exception){
        ResponseEntity<Error> resultado;

        String exceptionNombre = exception.getClass().getSimpleName();
        String mensaje = exception.getMessage();
        Integer codigo = CODIGOS_ESTADO.get(exceptionNombre);

        if(codigo != null){
            Error error = new Error(exceptionNombre, mensaje);
            resultado = new ResponseEntity<>(error, HttpStatus.valueOf(codigo));
        }else{
            Error error = new Error(exceptionNombre, OCURRIO_ERROR_FAVOR_CONTACTAR_ADMINISTRADOR);
            resultado = new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return resultado;
    }
}
