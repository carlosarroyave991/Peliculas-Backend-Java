package com.animeflv.animegratis.aplicacion.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ComandoClient {
    private int clientId;
    //private String document;
    private String name;
    private String lastname;
    private String nickname;
    private String email;
    private String password;
    private boolean active;
    private LocalDateTime creationDate;
}
