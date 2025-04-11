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

    public zonaSocial() {
    }

    public zonaSocial(int idZona, String nombreZona, String ubicacion, int capacidad, List<reservaZona> reservaZonas) {
        this.idZona = idZona;
        this.nombreZona = nombreZona;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.reservaZonas = reservaZonas;
    }

    public int getIdZona() {
        return idZona;
    }

    public void setIdZona(int idZona) {
        this.idZona = idZona;
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<reservaZona> getReservaZonas() {
        return reservaZonas;
    }

    public void setReservaZonas(List<reservaZona> reservaZonas) {
        this.reservaZonas = reservaZonas;
    }

    @Override
    public String toString() {
        return "zonaSocial{" +
                "idZona=" + idZona +
                ", nombreZona='" + nombreZona + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", capacidad=" + capacidad +
                ", reservaZonas=" + reservaZonas +
                '}';
    }
}
