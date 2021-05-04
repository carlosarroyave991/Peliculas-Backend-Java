package com.animeflv.animegratis.aplicacion.manejador.gender;

import com.animeflv.animegratis.dominio.modelo.Gender;
import com.animeflv.animegratis.dominio.servicio.GenderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@AllArgsConstructor
@Component
public class ManejadorListarPorNameGender {
    private GenderService genderService;

    public Optional<Gender> ejecutar(String name){
        return genderService.findByName(name);
    }
}
