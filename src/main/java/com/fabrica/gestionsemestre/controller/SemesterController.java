package com.fabrica.gestionsemestre.controller;

import com.fabrica.gestionsemestre.Repository.SemesterRepository;
import com.fabrica.gestionsemestre.dto.SemesterDto;
import com.fabrica.gestionsemestre.model.Semester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/semestres")
public class SemesterController {
    @Autowired
    private SemesterRepository semesterRepository;
    @PostMapping
    public void ingresarSemestre(@RequestBody SemesterDto semesterDto){
       // semesterRepository.save(new Semester(semesterDto));

     System.out.println(semesterDto);
    //  System.out.println("hola");}
    }

}