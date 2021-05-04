package com.animeflv.animegratis.dominio.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Gender {
    private int genderId;
    private String name;
    private LocalDateTime creationDate;
}
