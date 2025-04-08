package com.example.ConjuntoResidencialQuiz.Model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Propietario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPropietario;
    private String nombrePropietario;
    private String cedulaPropietario;
    private Date fechaVisita;
    private Date horaEntrada;

    @OneToMany(mappedBy = "propietario")
    private List<Visitante> visitantes;

    @OneToMany(mappedBy = "propietario")
    private List<reservaZona>reservaZonas;

    @OneToMany(mappedBy = "propietario")
    private List<reservaParqueadero>reservaParqueaderos;
}
