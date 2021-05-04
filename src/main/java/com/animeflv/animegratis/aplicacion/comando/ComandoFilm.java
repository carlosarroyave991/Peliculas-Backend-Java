package com.animeflv.animegratis.aplicacion.comando;

import com.animeflv.animegratis.dominio.modelo.Client;
import com.animeflv.animegratis.dominio.modelo.Comment;
import com.animeflv.animegratis.dominio.modelo.Gender;
import com.animeflv.animegratis.dominio.modelo.View;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ComandoFilm {
    private int filmId;
    private String description;
    private String name;
    private String image;
    //private String url;
    private boolean active;
    private Date releaseDate;
    private LocalDateTime creationDate;
    private Client client;
    private List<Client> clients;
    private List<Comment> comments;
    private List<Gender> gender;
    private View view;
}
