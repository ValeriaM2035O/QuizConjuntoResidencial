package com.example.ConjuntoResidencialQuiz.Repository;

import com.example.ConjuntoResidencialQuiz.Model.zonaSocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface zonaSocialRepository extends JpaRepository<zonaSocial, Integer> {
}
