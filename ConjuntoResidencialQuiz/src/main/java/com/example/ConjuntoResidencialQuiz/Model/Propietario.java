package com.example.ConjuntoResidencialQuiz.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalTime;
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
    private LocalTime horaEntrada;

    @OneToMany(mappedBy = "propietario", fetch = FetchType.EAGER)
    private List<Visitante> visitantes;

    @OneToMany(mappedBy = "propietario")
    private List<reservaZona>reservaZonas;

    @OneToMany(mappedBy = "propietario")
    private List<reservaParqueadero>reservaParqueaderos;


    public Propietario() {
    }

    public Propietario(int idPropietario, String nombrePropietario, String cedulaPropietario, Date fechaVisita, LocalTime horaEntrada, List<Visitante> visitantes, List<reservaZona> reservaZonas, List<reservaParqueadero> reservaParqueaderos) {
        this.idPropietario = idPropietario;
        this.nombrePropietario = nombrePropietario;
        this.cedulaPropietario = cedulaPropietario;
        this.fechaVisita = fechaVisita;
        this.horaEntrada = horaEntrada;
        this.visitantes = visitantes;
        this.reservaZonas = reservaZonas;
        this.reservaParqueaderos = reservaParqueaderos;
    }

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getCedulaPropietario() {
        return cedulaPropietario;
    }

    public void setCedulaPropietario(String cedulaPropietario) {
        this.cedulaPropietario = cedulaPropietario;
    }

    public Date getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(Date fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public List<Visitante> getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(List<Visitante> visitantes) {
        this.visitantes = visitantes;
    }

    public List<reservaZona> getReservaZonas() {
        return reservaZonas;
    }

    public void setReservaZonas(List<reservaZona> reservaZonas) {
        this.reservaZonas = reservaZonas;
    }

    public List<reservaParqueadero> getReservaParqueaderos() {
        return reservaParqueaderos;
    }

    public void setReservaParqueaderos(List<reservaParqueadero> reservaParqueaderos) {
        this.reservaParqueaderos = reservaParqueaderos;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "idPropietario=" + idPropietario +
                ", nombrePropietario='" + nombrePropietario + '\'' +
                ", cedulaPropietario='" + cedulaPropietario + '\'' +
                ", fechaVisita=" + fechaVisita +
                ", horaEntrada=" + horaEntrada +
                ", visitantes=" + visitantes +
                ", reservaZonas=" + reservaZonas +
                ", reservaParqueaderos=" + reservaParqueaderos +
                '}';
    }
}
