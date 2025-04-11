package com.example.ConjuntoResidencialQuiz.Service;

import com.example.ConjuntoResidencialQuiz.Model.reservaZona;
import com.example.ConjuntoResidencialQuiz.Repository.reservaZonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class reservaZonaService {

    @Autowired
    private reservaZonaRepository reservaZonaRepository;


    public List<reservaZona> getreservaPorPropietario(Integer idPropietario) {
        return reservaZonaRepository.findByPropietario_IdPropietario(idPropietario);
    }

    public List<reservaZona> getreservaPorFecha(Date fecha) {
        return reservaZonaRepository.findByFecha(fecha);
    }

    public reservaZona guardar(reservaZona reservaZona) {
        return reservaZonaRepository.save(reservaZona);
    }

    public List<reservaZona> Listar() {
        return reservaZonaRepository.findAll();
    }
}
