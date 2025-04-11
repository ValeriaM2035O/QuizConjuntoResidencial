package com.example.ConjuntoResidencialQuiz.Service;

import com.example.ConjuntoResidencialQuiz.Model.zonaSocial;
import com.example.ConjuntoResidencialQuiz.Repository.zonaSocialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class zonaSocialService {

    @Autowired
    private zonaSocialRepository zonaSocialRepository;

    public zonaSocial guardar(zonaSocial zonaSocial) {
        return zonaSocialRepository.save(zonaSocial);
    }

    public List<zonaSocial> Listar() {

        return zonaSocialRepository.findAll();
    }
}
