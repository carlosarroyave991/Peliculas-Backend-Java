package com.animeflv.animegratis.aplicacion.manejador.gender;

import com.animeflv.animegratis.dominio.modelo.Gender;
import com.animeflv.animegratis.dominio.servicio.GenderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class ManejadorListarTodosGender {
private GenderService genderService;

public List<Gender> ejecutar(){
    return genderService.getAll();
}
}
