package com.fabrica.gestionsemestre.model;


/*
 *definicio de  clase Semester
 * */
import jakarta.persistence.*; //importamos las librerias de jakarta para la persistencia de datos
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


import java.time.LocalDate; //importamos la libreria de java para la fecha

@Entity(name = "Semestre")  //definimos la entidad de la clase Semester
@Table(name = "Semestre")   //definimos la tabla de la clase Semester
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")


public class Semester {

    @Id                                     //definimos el id de la clase Semester  como llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //definimos la estrategia de generacion de id   como autoincremental
    private Long id;                                    //definimos el id de la clase Semester

    @Column(name = "fecha_inicio")

    private LocalDate fechaInicio;

    @Column(name = "fecha_final")
    private LocalDate fechaFinal;

    @Column(name = "fecha_evaluacion_40")
    private LocalDate fechaEvaluacion40;

    @Column(name = "fecha_examen_final")
    private LocalDate fechaExamenFinal;

    @Column(name = "fecha_habilitaciones")
    private LocalDate fechaHabilitaciones;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    // getters y setters Generados gracias a libreria Lombok y sus anotaciones @Getter,
    //@NoArgsConstructor
    //@AllArgsConstructor
    //@EqualsAndHashCode(of = "id")

}
