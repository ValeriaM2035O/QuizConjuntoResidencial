package com.example.ConjuntoResidencialQuiz.Model;

import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.Date;
@Entity
public class reservaParqueadero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReservaParqueadero;
    private Date fechaParquedadero;
    private LocalTime horaInicioParqueadero;

    @ManyToOne
    @JoinColumn(name = "idPropietario")
    private Propietario propietario;

    public reservaParqueadero() {
    }

    public reservaParqueadero(int idReservaParqueadero, Date fechaParquedadero, LocalTime horaInicioParqueadero, Propietario propietario) {
        this.idReservaParqueadero = idReservaParqueadero;
        this.fechaParquedadero = fechaParquedadero;
        this.horaInicioParqueadero = horaInicioParqueadero;
        this.propietario = propietario;
    }

    public int getIdReservaParqueadero() {
        return idReservaParqueadero;
    }

    public void setIdReservaParqueadero(int idReservaParqueadero) {
        this.idReservaParqueadero = idReservaParqueadero;
    }

    public Date getFechaParquedadero() {
        return fechaParquedadero;
    }

    public void setFechaParquedadero(Date fechaParquedadero) {
        this.fechaParquedadero = fechaParquedadero;
    }

    public LocalTime getHoraInicioParqueadero() {
        return horaInicioParqueadero;
    }

    public void setHoraInicioParqueadero(LocalTime horaInicioParqueadero) {
        this.horaInicioParqueadero = horaInicioParqueadero;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "reservaParqueadero{" +
                "idReservaParqueadero=" + idReservaParqueadero +
                ", fechaParquedadero=" + fechaParquedadero +
                ", horaInicioParqueadero=" + horaInicioParqueadero +
                ", propietario=" + propietario +
                '}';
    }
}
