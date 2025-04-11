package com.example.ConjuntoResidencialQuiz.Repository;

import com.example.ConjuntoResidencialQuiz.Model.Visitante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitanteRepository extends JpaRepository<Visitante, Integer> {

}
