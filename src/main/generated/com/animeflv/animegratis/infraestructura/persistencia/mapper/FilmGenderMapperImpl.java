package com.animeflv.animegratis.infraestructura.persistencia.mapper;

import com.animeflv.animegratis.dominio.modelo.FilmGender;
import com.animeflv.animegratis.infraestructura.persistencia.entidad.PeliculaGenero;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-05-04T17:36:22-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.10 (Oracle Corporation)"
)
@Component
public class FilmGenderMapperImpl implements FilmGenderMapper {

    @Override
    public FilmGender toFilmGender(PeliculaGenero PeliculaGenero) {
        if ( PeliculaGenero == null ) {
            return null;
        }

        FilmGender filmGender = new FilmGender();

        if ( PeliculaGenero.getId() != null ) {
            filmGender.setFilmGenderId( PeliculaGenero.getId() );
        }
        if ( PeliculaGenero.getPeliculaId() != null ) {
            filmGender.setFilmId( PeliculaGenero.getPeliculaId() );
        }
        if ( PeliculaGenero.getGeneroId() != null ) {
            filmGender.setGenderId( PeliculaGenero.getGeneroId() );
        }

        return filmGender;
    }

    @Override
    public PeliculaGenero toPeliculaGenero(FilmGender filmGender) {
        if ( filmGender == null ) {
            return null;
        }

        PeliculaGenero peliculaGenero = new PeliculaGenero();

        peliculaGenero.setId( filmGender.getFilmGenderId() );
        peliculaGenero.setPeliculaId( filmGender.getFilmId() );
        peliculaGenero.setGeneroId( filmGender.getGenderId() );

        return peliculaGenero;
    }
}
