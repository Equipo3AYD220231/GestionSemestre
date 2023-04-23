package com.fabrica.gestionsemestre.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;

@Entity(name = "Semestre")
@Table(name = "Semestre")


public class Semestre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_inicio")
    private LocalDate fechaInicio;

    @Column(name = "fecha_final")
    private LocalDate fechaFinal;

    @Column(name = "fecha_evaluacion")
    private LocalDate fechaEvaluacion;

    @Column(name = "fecha_examenes")
    private LocalDate fechaExamenes;

    @Column(name = "fecha_habilitaciones")
    private LocalDate fechaHabilitaciones;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    // getters y setters

}
