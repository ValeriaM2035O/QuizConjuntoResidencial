package com.example.ConjuntoResidencialQuiz.Service;

import com.example.ConjuntoResidencialQuiz.Model.reservaParqueadero;
import com.example.ConjuntoResidencialQuiz.Repository.reservaParqueaderoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class reservaParqueaderoService {


    @Autowired
    private reservaParqueaderoRepository reservaParqueaderoRepository;


    public List<reservaParqueadero> getParqueaderoPorPropietario(Integer idPropietario) {
        return reservaParqueaderoRepository.findByPropietario_IdPropietario(idPropietario);
    }

    public reservaParqueadero guardar(reservaParqueadero reservaParqueadero) {
        return reservaParqueaderoRepository.save(reservaParqueadero);
    }

    public List<reservaParqueadero> Listar() {
        return reservaParqueaderoRepository.findAll();
    }
}
