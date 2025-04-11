package com.example.ConjuntoResidencialQuiz.Repository;

import com.example.ConjuntoResidencialQuiz.Model.reservaZona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface reservaZonaRepository extends JpaRepository<reservaZona, Integer> {


    List<reservaZona> findByPropietario_IdPropietario(Integer idPropietario);

    List<reservaZona> findByFecha(Date fecha);
}
