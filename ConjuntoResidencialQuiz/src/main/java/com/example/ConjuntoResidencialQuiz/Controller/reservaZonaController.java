package com.example.ConjuntoResidencialQuiz.Controller;

import com.example.ConjuntoResidencialQuiz.Model.Propietario;
import com.example.ConjuntoResidencialQuiz.Model.Visitante;
import com.example.ConjuntoResidencialQuiz.Model.reservaZona;
import com.example.ConjuntoResidencialQuiz.Service.reservaZonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/reservaZ")
public class reservaZonaController {

    @Autowired
    private reservaZonaService reservaZonaService;

    @PostMapping("/guardar")
    public reservaZona guardar(@RequestBody reservaZona reservaZona){
        return reservaZonaService.guardar(reservaZona);
    }
    @GetMapping("/reservaPorPropietario/{id}")
    public List<reservaZona> getreservaPorPropietario(@PathVariable("id") Integer idPropietario){
        return reservaZonaService.getreservaPorPropietario(idPropietario);
    }
    @GetMapping("/reservaPorFecha")
    public List<reservaZona> getreservaPorFecha(Date fecha){
        return reservaZonaService.getreservaPorFecha(fecha);
    }
    @GetMapping("/listar")
    public List<reservaZona> Listar(){
        return reservaZonaService.Listar();
    }
}

