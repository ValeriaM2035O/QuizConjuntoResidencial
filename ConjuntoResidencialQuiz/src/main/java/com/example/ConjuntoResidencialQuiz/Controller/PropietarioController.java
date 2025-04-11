package com.example.ConjuntoResidencialQuiz.Controller;

import com.example.ConjuntoResidencialQuiz.Model.Propietario;
import com.example.ConjuntoResidencialQuiz.Model.reservaZona;
import com.example.ConjuntoResidencialQuiz.Model.zonaSocial;
import com.example.ConjuntoResidencialQuiz.Service.PropietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/propietario")
public class PropietarioController {

    @Autowired
    private PropietarioService propietarioService;

    @PostMapping("/guardar")
    public Propietario guardar(@RequestBody Propietario propietario){
        Propietario guardado = propietarioService.guardar(propietario);
        System.out.println("Guardado: " + guardado);
        return guardado;
    }
    @GetMapping("/{id}/Visitantes")
    public Optional<Propietario> getPropietarioConVisitantes(@PathVariable("id") Integer idVisitante){
        return propietarioService.getPropietarioConVisitantes(idVisitante);
    }
    @GetMapping("/listarPropietario")
    public List<Propietario> Listar(){
        return propietarioService.Listar();
    }
}
