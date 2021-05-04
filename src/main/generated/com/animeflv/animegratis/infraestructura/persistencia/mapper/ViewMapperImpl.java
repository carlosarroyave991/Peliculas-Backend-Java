package com.animeflv.animegratis.infraestructura.persistencia.mapper;

import com.animeflv.animegratis.dominio.modelo.View;
import com.animeflv.animegratis.infraestructura.persistencia.entidad.Vista;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-28T15:35:48-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.10 (Oracle Corporation)"
)
@Component
public class ViewMapperImpl implements ViewMapper {

    @Override
    public View toView(Vista vista) {
        if ( vista == null ) {
            return null;
        }

        View view = new View();

        if ( vista.getId() != null ) {
            view.setViewId( vista.getId() );
        }
        if ( vista.getClienteId() != null ) {
            view.setClientId( vista.getClienteId() );
        }
        if ( vista.getPeliculaId() != null ) {
            view.setFilmId( vista.getPeliculaId() );
        }

        return view;
    }

    @Override
    public Vista toVista(View view) {
        if ( view == null ) {
            return null;
        }

        Vista vista = new Vista();

        vista.setId( view.getViewId() );
        vista.setClienteId( view.getClientId() );
        vista.setPeliculaId( view.getFilmId() );

        return vista;
    }
}
