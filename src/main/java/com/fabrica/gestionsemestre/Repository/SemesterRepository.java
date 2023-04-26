package com.fabrica.gestionsemestre.Repository;

import com.fabrica.gestionsemestre.dto.SemesterDto;
import com.fabrica.gestionsemestre.model.Semester;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface SemesterRepository extends JpaRepository<Semester, Long> {

}
