package com.example.ConjuntoResidencialQuiz.Model;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class reservaZona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReservaZona;
    private Date fecha;
    private Date horaInicio;

    @ManyToOne
    @JoinColumn(name = "idPropietario")
    private Propietario propietario;

    @ManyToOne
    @JoinColumn(name = "idZona")
    private zonaSocial zonaSocial;



}
