package com.example.ConjuntoResidencialQuiz.Repository;

import com.example.ConjuntoResidencialQuiz.Model.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropietarioRepository extends JpaRepository<Propietario, Integer> {
}
