package com.example.ConjuntoResidencialQuiz.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    public Visitante() {
    }

    public Visitante(int idVisitante, String nombreVisitante, String cedulaVisitante, String telefono, String correo, Propietario propietario) {
        this.idVisitante = idVisitante;
        this.nombreVisitante = nombreVisitante;
        this.cedulaVisitante = cedulaVisitante;
        this.telefono = telefono;
        this.correo = correo;
        this.propietario = propietario;
    }

    public int getIdVisitante() {
        return idVisitante;
    }

    public void setIdVisitante(int idVisitante) {
        this.idVisitante = idVisitante;
    }

    public String getNombreVisitante() {
        return nombreVisitante;
    }

    public void setNombreVisitante(String nombreVisitante) {
        this.nombreVisitante = nombreVisitante;
    }

    public String getCedulaVisitante() {
        return cedulaVisitante;
    }

    public void setCedulaVisitante(String cedulaVisitante) {
        this.cedulaVisitante = cedulaVisitante;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Visitante{" +
                "idVisitante=" + idVisitante +
                ", nombreVisitante='" + nombreVisitante + '\'' +
                ", cedulaVisitante='" + cedulaVisitante + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", propietario=" + propietario +
                '}';
    }
}
