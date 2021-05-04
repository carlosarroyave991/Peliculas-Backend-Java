package com.animeflv.animegratis.aplicacion.comando;

import com.animeflv.animegratis.dominio.modelo.Client;
import com.animeflv.animegratis.dominio.modelo.Film;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ComandoComment {
    private int commentId;
    private String comment;
    private int clientId;
    private int filmId;
    private LocalDateTime creationDate;
    private Film film;
    private Client client;
}
