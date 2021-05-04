package com.animeflv.animegratis.aplicacion.fabrica;

import com.animeflv.animegratis.aplicacion.comando.ComandoView;
import com.animeflv.animegratis.dominio.modelo.View;
import org.springframework.stereotype.Component;

@Component
public class FabricaView {
    public View crear(ComandoView comandoView){
        return new View(comandoView.getViewId(), comandoView.getClientId(), comandoView.getFilmId(), comandoView.getFilm(), comandoView.getClient());
    }
}
