package com.example.F1.models;

import javax.persistence.*;

@Entity
@Table(name="Corredores De F1")
public class Corredor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false )
    
    private Long id;
    private String nombre;
    private String equipo;
    private String patrocinio;
    private String token;
    public String getEquipo() {
        return equipo;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public String getPatrocinio() {
        return patrocinio;
    }
    public void setPatrocinio(String patrocinio) {
        this.patrocinio = patrocinio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }


}
