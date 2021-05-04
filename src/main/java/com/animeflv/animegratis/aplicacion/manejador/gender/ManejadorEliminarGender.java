package com.animeflv.animegratis.aplicacion.manejador.gender;

import com.animeflv.animegratis.dominio.servicio.GenderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ManejadorEliminarGender {
private GenderService genderService;

public void ejecutar(int genderId){
    genderService.delete(genderId);
    }
}
