package com.example.ConjuntoResidencialQuiz.Service;

import com.example.ConjuntoResidencialQuiz.Model.Visitante;
import com.example.ConjuntoResidencialQuiz.Repository.VisitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitanteService {

    @Autowired
    private VisitanteRepository visitanteRepository;

    public Visitante guardar(Visitante visitante) {
        return visitanteRepository.save(visitante);
    }

    public List<Visitante> Listar() {

        return visitanteRepository.findAll();
    }
}
