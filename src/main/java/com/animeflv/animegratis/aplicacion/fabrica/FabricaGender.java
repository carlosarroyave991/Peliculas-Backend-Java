package com.animeflv.animegratis.aplicacion.fabrica;

import com.animeflv.animegratis.aplicacion.comando.ComandoGender;
import com.animeflv.animegratis.dominio.modelo.Gender;
import org.springframework.stereotype.Component;

@Component
public class FabricaGender {
    public Gender crear(ComandoGender comandoGender){
        return new Gender(comandoGender.getGenderId(), comandoGender.getName(), comandoGender.getCreationDate());
    }
}
