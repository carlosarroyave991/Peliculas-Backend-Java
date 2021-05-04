package com.animeflv.animegratis.infraestructura.persistencia.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.catalina.LifecycleState;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="peliculas")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String descripcion;
private String nombre;
private String imagen;
//private String url;
@Column(name ="fecha_estreno")
private LocalDate fechaEstreno;
@Column(name ="fecha_creacion")
private LocalDateTime fechaCreacion;
private Boolean estado;

/*@OneToMany(mappedBy = "")
    private List<Cliente> clientes;*/

}
