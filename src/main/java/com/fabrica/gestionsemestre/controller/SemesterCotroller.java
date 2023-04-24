package com.fabrica.gestionsemestre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/semestres")
public class SemesterController {

    @Autowired
    private SemesterRepository semestreRepository;

    @GetMapping
    public List<Semestre> getAll() {
        return sem
