package com.fabrica.gestionsemestre.model;


/*
 *definicio de  clase Semester
 *
 * */
import com.fabrica.gestionsemestre.dto.SemesterDto;
import jakarta.persistence.*; //importamos las librerias de jakarta para la persistencia de datos
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonFormat; //importamos la libreria de jackson para el formato de json de fechas
import java.time.LocalDate; //importamos la libreria de java para la fecha
import java.util.Objects;

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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-dd")
    private LocalDate fechaInicio;

    @Column(name = "fecha_final")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate fechaFinal;

    @Column(name = "fecha_evaluacion_40")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate fechaEvaluacion40;

    @Column(name = "fecha_examen_final")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate fechaExamenFinal;

    @Column(name = "fecha_habilitaciones")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate fechaHabilitaciones;

    public Semester(SemesterDto semesterDto) {
        this.fechaInicio = semesterDto.fechaInicio();
        this.fechaFinal = semesterDto.fechaFinal();
        this.fechaEvaluacion40 = semesterDto.fechaEvaluacion40();
        this.fechaExamenFinal = semesterDto.fechaExamenFinal();
        this.fechaHabilitaciones = semesterDto.fechaHabilitaciones();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


}
