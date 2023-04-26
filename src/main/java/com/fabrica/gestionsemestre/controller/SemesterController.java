package com.fabrica.gestionsemestre.controller;

import com.fabrica.gestionsemestre.Repository.SemesterRepository;
import com.fabrica.gestionsemestre.model.Semester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/semestres")
public class SemesterController {
    @Autowired
    private SemesterRepository semesterRepository;
    @PostMapping
    public void ingresarSemestre(@RequestBody String parametro){
        semesterRepository.save(new Semester());

      System.out.println(parametro);
    //  System.out.println("hola");}
    }

}