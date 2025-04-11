package com.example.ConjuntoResidencialQuiz.Controller;

import com.example.ConjuntoResidencialQuiz.Model.Visitante;
import com.example.ConjuntoResidencialQuiz.Service.VisitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/visitante")
public class VisitanteController {

    @Autowired
    private VisitanteService visitanteService;

    @PostMapping("/guardar")
    public Visitante guardar(@RequestBody Visitante visitante){
        return visitanteService.guardar(visitante);
    }
    @GetMapping("/listar")
    public List<Visitante> Listar(){
        return visitanteService.Listar();
    }}
