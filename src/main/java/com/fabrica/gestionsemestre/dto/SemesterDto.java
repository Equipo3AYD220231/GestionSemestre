package com.fabrica.gestionsemestre.dto;

import java.time.LocalDate;


public record SemesterDto(LocalDate fechaInicio, LocalDate fechaFinal, LocalDate fechaEvaluacion40, LocalDate fechaExamenFinal, LocalDate    fechaHabilitaciones) {

}
