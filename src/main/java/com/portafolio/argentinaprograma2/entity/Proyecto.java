package com.portafolio.argentinaprograma2.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Proyecto {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
     private String nombre;
     @Lob
     private String descripcion;
     private String link;
     @Temporal(TemporalType.DATE)
     private Date inicio;
    @Temporal(TemporalType.DATE)
    private Date fin;

public Proyecto(){

}

    public Proyecto (String nombre, String link,Date inicio, Date fin, String descripcion) {
        this.nombre = nombre;
        this.link=link;
        this.descripcion=descripcion;
        this.inicio=inicio;
        this.fin=fin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }
}
