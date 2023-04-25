package com.fabrica.gestionsemestre.dto;

import java.time.LocalDate;

public record SemesterDto(LocalDate fechaInicio, LocalDate fechaFinal, LocalDate fechaEvaluacion, LocalDate fechaExamenes, LocalDate    fechaHabilitaciones) {
}
