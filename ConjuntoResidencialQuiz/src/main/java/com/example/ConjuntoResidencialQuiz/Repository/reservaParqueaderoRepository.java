package com.example.ConjuntoResidencialQuiz.Repository;

import com.example.ConjuntoResidencialQuiz.Model.reservaParqueadero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface reservaParqueaderoRepository extends JpaRepository<reservaParqueadero, Integer> {
    List<reservaParqueadero> findByPropietario_IdPropietario(Integer idPropietario);
}
