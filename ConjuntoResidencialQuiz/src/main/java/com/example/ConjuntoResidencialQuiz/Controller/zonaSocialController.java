package com.example.ConjuntoResidencialQuiz.Controller;


import com.example.ConjuntoResidencialQuiz.Model.zonaSocial;
import com.example.ConjuntoResidencialQuiz.Service.zonaSocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/zonaS")
public class zonaSocialController {

    @Autowired
    private zonaSocialService zonaSocialService;

    @PostMapping("/guardar")
    public zonaSocial guardar(@RequestBody zonaSocial zonaSocial){
        return zonaSocialService.guardar(zonaSocial);
    }
    @GetMapping("/listar")
    public List<zonaSocial> Listar(){
        return zonaSocialService.Listar();
    }
}
