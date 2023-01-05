package com.portafolio.argentinaprograma2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import java.util.Date;
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;

    private String ano;
    private String estado;
    private  String nombredeinstituto;

    public  Educacion(){

    }

    public Educacion( String titulo, String ano, String estado, String nombredeinstituto) {

        this.estado=estado;
        this.titulo=titulo;
        this.ano=ano;
        this.nombredeinstituto=nombredeinstituto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombredeinstituto() {
        return nombredeinstituto;
    }

    public void setNombredeinstituto(String nombredeinstituto) {
        this.nombredeinstituto = nombredeinstituto;
    }
}
