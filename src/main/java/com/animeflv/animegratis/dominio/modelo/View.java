package com.animeflv.animegratis.dominio.modelo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class View {
    private int viewId;
    private int clientId;
    private int filmId;
    private Film film;
    private Client client;
}
