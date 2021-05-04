package com.animeflv.animegratis.aplicacion.manejador.gender;

import com.animeflv.animegratis.aplicacion.comando.ComandoGender;
import com.animeflv.animegratis.aplicacion.fabrica.FabricaGender;
import com.animeflv.animegratis.dominio.modelo.Gender;
import com.animeflv.animegratis.dominio.servicio.GenderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ManejadorCrearGender {
    private GenderService genderService;
    private FabricaGender fabricaGender;

    public Gender ejecutar(ComandoGender comandoGender){
        Gender gender = fabricaGender.crear(comandoGender);
        return genderService.save(gender);
    }
}
