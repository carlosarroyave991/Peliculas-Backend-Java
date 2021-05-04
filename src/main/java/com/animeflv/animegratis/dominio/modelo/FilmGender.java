package com.animeflv.animegratis.dominio.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FilmGender {
    private int filmGenderId;
    private int filmId;
    private int genderId;
    private Gender gender;
}
