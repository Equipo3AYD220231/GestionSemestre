package com.fabrica.gestionsemestre.controller;

import com.fabrica.gestionsemestre.Repository.SemesterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/semestres")
public class SemesterController {

    @PostMapping
    public void ingresarSemestre(@RequestBody String parametro){
      System.out.println(parametro);
    //  System.out.println("hola");}
    }
}