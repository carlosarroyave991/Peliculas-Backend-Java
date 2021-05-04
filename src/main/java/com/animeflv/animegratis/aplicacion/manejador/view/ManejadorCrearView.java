package com.animeflv.animegratis.aplicacion.manejador.view;

import com.animeflv.animegratis.aplicacion.comando.ComandoView;
import com.animeflv.animegratis.aplicacion.fabrica.FabricaView;
import com.animeflv.animegratis.dominio.modelo.View;
import com.animeflv.animegratis.dominio.servicio.ViewService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ManejadorCrearView {
    private ViewService viewService;
    private FabricaView fabricaView;

    public View ejecutar(ComandoView comandoView){
        View view = fabricaView.crear(comandoView);
        return viewService.save(view);
    }
}
