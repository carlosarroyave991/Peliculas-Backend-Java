package com.animeflv.animegratis.aplicacion.manejador.view;

import com.animeflv.animegratis.dominio.modelo.View;
import com.animeflv.animegratis.dominio.servicio.ViewService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@AllArgsConstructor
@Component
public class ManejadorListarPorIdView {
    private ViewService viewService;

    public Optional<View> ejecutar(int viewId){
        return viewService.findById(viewId);
    }
}
