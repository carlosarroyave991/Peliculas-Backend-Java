package com.animeflv.animegratis.aplicacion.comando;

import com.animeflv.animegratis.dominio.modelo.Client;
import com.animeflv.animegratis.dominio.modelo.Film;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ComandoView {
    private int viewId;
    private int clientId;
    private int filmId;
    private Film film;
    private Client client;
}
