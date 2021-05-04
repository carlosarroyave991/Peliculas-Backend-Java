package com.animeflv.animegratis.aplicacion.manejador.view;


import com.animeflv.animegratis.dominio.servicio.ViewService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ManejadorEliminarView {
    private ViewService viewService;

    public void ejecutar(int viewId){
        viewService.delete(viewId);
    }
}
