package com.animeflv.animegratis.dominio.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Film {
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
