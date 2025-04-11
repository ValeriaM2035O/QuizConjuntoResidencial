package com.example.ConjuntoResidencialQuiz.Controller;

import com.example.ConjuntoResidencialQuiz.Model.Propietario;
import com.example.ConjuntoResidencialQuiz.Model.reservaParqueadero;
import com.example.ConjuntoResidencialQuiz.Model.reservaZona;
import com.example.ConjuntoResidencialQuiz.Service.PropietarioService;
import com.example.ConjuntoResidencialQuiz.Service.reservaParqueaderoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservaP")
public class reservaParqueaderoController {

    @Autowired
    private reservaParqueaderoService reservaParqueaderoService;

    @PostMapping("/guardar")
    public reservaParqueadero guardar(@RequestBody reservaParqueadero reservaParqueadero){
        return reservaParqueaderoService.guardar(reservaParqueadero);
    }
    @GetMapping("/porPropietario/{id}")
    public List<reservaParqueadero> getParqueaderoPorPropietario(@PathVariable("id") Integer idPropietario) {
        return reservaParqueaderoService.getParqueaderoPorPropietario(idPropietario);
    }
    @GetMapping("/listar")
    public List<reservaParqueadero> Listar(){
        return reservaParqueaderoService.Listar();
    }
}


