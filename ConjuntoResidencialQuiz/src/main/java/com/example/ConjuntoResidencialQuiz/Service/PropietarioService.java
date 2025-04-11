package com.example.ConjuntoResidencialQuiz.Service;

import com.example.ConjuntoResidencialQuiz.Model.Propietario;
import com.example.ConjuntoResidencialQuiz.Repository.PropietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PropietarioService {

    @Autowired
    private PropietarioRepository propietarioRepository;

    public Optional<Propietario> getPropietarioConVisitantes(Integer idVisitante) {
        return propietarioRepository.findById(idVisitante);
    }

    public Propietario guardar(Propietario propietario) {
        return propietarioRepository.save(propietario);
    }

    public List<Propietario> Listar() {
        return propietarioRepository.findAll();
    }
}
