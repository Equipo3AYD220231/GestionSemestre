package com.fabrica.gestionsemestre.controller;

import com.fabrica.gestionsemestre.Repository.SemesterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/semestres")
public class SemesterController {
    @GetMapping
    public String prueba1(){
        return "hola prueba";
    }

    @Autowired
    private SemesterRepository semestreRepository;

    @GetMapping("semestre")
    public String Semestre(@RequestParam() {
        return "semestre";
    }
}