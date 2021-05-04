package com.animeflv.animegratis.aplicacion.comando;

import com.animeflv.animegratis.dominio.modelo.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoFilmGender {
    private int filmGenderId;
    private int filmId;
    private int genderId;
    private Gender gender;
}
