package com.animeflv.animegratis.dominio.modelo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    private int commentId;
    private String comment;
    private int clientId;
    private int filmId;
    private LocalDateTime creationDate;
    private Film film;
    private Client client;
}
