package com.example.ConjuntoResidencialQuiz.Model;

import jakarta.persistence.*;

@Entity
public class Visitante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVisitante;
    private String nombreVisitante;
    private String cedulaVisitante;
    private String telefono;
    private String correo;

    @ManyToOne
    @JoinColumn(name = "idPropietario")
    private Propietario propietario;


}
