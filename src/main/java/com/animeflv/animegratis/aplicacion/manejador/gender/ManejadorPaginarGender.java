package com.animeflv.animegratis.aplicacion.manejador.gender;

import com.animeflv.animegratis.dominio.modelo.Gender;
import com.animeflv.animegratis.dominio.servicio.GenderService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ManejadorPaginarGender {
    private GenderService genderService;

    public Page<Gender> ejecutar(Pageable pageable){
        return genderService.findAll(pageable);
    }
}
