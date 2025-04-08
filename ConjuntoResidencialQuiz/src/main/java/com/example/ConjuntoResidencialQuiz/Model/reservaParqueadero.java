package com.example.ConjuntoResidencialQuiz.Model;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class reservaParqueadero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReservaParqueadero;
    private Date fechaParquedadero;
    private Date horaInicioParqueadero;

    @ManyToOne
    @JoinColumn(name = "idPropietario")
    private Propietario propietario;

}
