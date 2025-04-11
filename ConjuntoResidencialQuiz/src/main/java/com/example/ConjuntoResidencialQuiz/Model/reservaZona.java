package com.example.ConjuntoResidencialQuiz.Model;

import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.Date;
@Entity
public class reservaZona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReservaZona;
    private Date fecha;
    private LocalTime horaInicio;

    @ManyToOne
    @JoinColumn(name = "idPropietario")
    private Propietario propietario;

    @ManyToOne
    @JoinColumn(name = "idZona")
    private zonaSocial zonaSocial;

    public reservaZona() {
    }

    public reservaZona(int idReservaZona, Date fecha, LocalTime horaInicio, Propietario propietario, com.example.ConjuntoResidencialQuiz.Model.zonaSocial zonaSocial) {
        this.idReservaZona = idReservaZona;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.propietario = propietario;
        this.zonaSocial = zonaSocial;
    }

    public int getIdReservaZona() {
        return idReservaZona;
    }

    public void setIdReservaZona(int idReservaZona) {
        this.idReservaZona = idReservaZona;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public com.example.ConjuntoResidencialQuiz.Model.zonaSocial getZonaSocial() {
        return zonaSocial;
    }

    public void setZonaSocial(com.example.ConjuntoResidencialQuiz.Model.zonaSocial zonaSocial) {
        this.zonaSocial = zonaSocial;
    }

    @Override
    public String toString() {
        return "reservaZona{" +
                "idReservaZona=" + idReservaZona +
                ", fecha=" + fecha +
                ", horaInicio=" + horaInicio +
                ", propietario=" + propietario +
                ", zonaSocial=" + zonaSocial +
                '}';
    }

}
