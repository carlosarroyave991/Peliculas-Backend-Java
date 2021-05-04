package com.animeflv.animegratis.dominio.repositorio;


import com.animeflv.animegratis.dominio.modelo.View;

import java.util.Optional;

public interface ViewRepository {
    View save(View view);
    void delete(int viewId);
    Optional<View> findById(int viewId);
}
