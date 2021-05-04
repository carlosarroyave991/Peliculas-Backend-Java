package com.animeflv.animegratis.dominio.servicio;

import com.animeflv.animegratis.dominio.exception.ViewException;
import com.animeflv.animegratis.dominio.modelo.View;
import com.animeflv.animegratis.dominio.repositorio.ViewRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class ViewService {
    private final static String ID_YA_EXISTE = "El id ya existe en la base de datos";
    private final static String ID_NO_ENCONTRADO = "El id no fue encontrado";
    private ViewRepository viewRepository;

    public Optional<View> findById(int viewId){
        Optional<View> view = viewRepository.findById(viewId);
        if(view.isPresent()){
            return viewRepository.findById(viewId);
        }else{
            throw new ViewException(ID_YA_EXISTE);
        }
    }

    public View save(View view){
        Optional<View> result = viewRepository.findById(view.getViewId());
        if(result.isPresent()){
            throw new ViewException(ID_YA_EXISTE);
        }else{
            return viewRepository.save(view);
        }
    }

    public void delete(int viewId){
        Optional<View> view = viewRepository.findById(viewId);
        if(view.isPresent()){
            viewRepository.delete(viewId);
        }else{
            throw new ViewException(ID_NO_ENCONTRADO);
        }
    }


}
