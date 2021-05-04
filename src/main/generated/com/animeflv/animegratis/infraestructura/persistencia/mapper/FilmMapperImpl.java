package com.animeflv.animegratis.infraestructura.persistencia.mapper;

import com.animeflv.animegratis.dominio.modelo.Film;
import com.animeflv.animegratis.infraestructura.persistencia.entidad.Pelicula;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-05-04T17:36:18-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.10 (Oracle Corporation)"
)
@Component
public class FilmMapperImpl implements FilmMapper {

    @Override
    public Film toFilm(Pelicula pelicula) {
        if ( pelicula == null ) {
            return null;
        }

        Film film = new Film();

        if ( pelicula.getId() != null ) {
            film.setFilmId( pelicula.getId() );
        }
        film.setDescription( pelicula.getDescripcion() );
        film.setName( pelicula.getNombre() );
        film.setImage( pelicula.getImagen() );
        if ( pelicula.getEstado() != null ) {
            film.setActive( pelicula.getEstado() );
        }
        if ( pelicula.getFechaEstreno() != null ) {
            film.setReleaseDate( Date.from( pelicula.getFechaEstreno().atStartOfDay( ZoneOffset.UTC ).toInstant() ) );
        }
        film.setCreationDate( pelicula.getFechaCreacion() );

        return film;
    }

    @Override
    public List<Film> toFilms(List<Pelicula> peliculas) {
        if ( peliculas == null ) {
            return null;
        }

        List<Film> list = new ArrayList<Film>( peliculas.size() );
        for ( Pelicula pelicula : peliculas ) {
            list.add( toFilm( pelicula ) );
        }

        return list;
    }

    @Override
    public Pelicula toPelicula(Film film) {
        if ( film == null ) {
            return null;
        }

        Pelicula pelicula = new Pelicula();

        pelicula.setId( film.getFilmId() );
        pelicula.setDescripcion( film.getDescription() );
        pelicula.setNombre( film.getName() );
        pelicula.setImagen( film.getImage() );
        pelicula.setEstado( film.isActive() );
        if ( film.getReleaseDate() != null ) {
            pelicula.setFechaEstreno( LocalDateTime.ofInstant( film.getReleaseDate().toInstant(), ZoneOffset.UTC ).toLocalDate() );
        }
        pelicula.setFechaCreacion( film.getCreationDate() );

        return pelicula;
    }
}
