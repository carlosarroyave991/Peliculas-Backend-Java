package com.animeflv.animegratis.infraestructura.persistencia.mapper;

import com.animeflv.animegratis.dominio.modelo.Gender;
import com.animeflv.animegratis.infraestructura.persistencia.entidad.Genero;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-28T15:35:48-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.10 (Oracle Corporation)"
)
@Component
public class GenderMapperImpl implements GenderMapper {

    @Override
    public Gender toGender(Genero genero) {
        if ( genero == null ) {
            return null;
        }

        Gender gender = new Gender();

        if ( genero.getId() != null ) {
            gender.setGenderId( genero.getId() );
        }
        gender.setName( genero.getNombre() );
        gender.setCreationDate( genero.getFechaCreacion() );

        return gender;
    }

    @Override
    public List<Gender> toGenders(List<Genero> generos) {
        if ( generos == null ) {
            return null;
        }

        List<Gender> list = new ArrayList<Gender>( generos.size() );
        for ( Genero genero : generos ) {
            list.add( toGender( genero ) );
        }

        return list;
    }

    @Override
    public Genero toGenero(Gender gender) {
        if ( gender == null ) {
            return null;
        }

        Genero genero = new Genero();

        genero.setId( gender.getGenderId() );
        genero.setNombre( gender.getName() );
        genero.setFechaCreacion( gender.getCreationDate() );

        return genero;
    }
}
