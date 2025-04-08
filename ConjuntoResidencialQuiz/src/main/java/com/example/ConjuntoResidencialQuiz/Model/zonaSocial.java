package com.example.ConjuntoResidencialQuiz.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class zonaSocial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idZona;
    private  String nombreZona;
    private String ubicacion;
    private int capacidad;

    @OneToMany(mappedBy = "idReservaZona")
    private List<reservaZona> reservaZonas;

}
