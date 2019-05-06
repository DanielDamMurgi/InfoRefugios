package com.refugios.inforefugios.common;

import java.io.Serializable;

public class Refugio implements Serializable {

    //ATRIBUTOS-------------------------------------------------------------------

    private int id;
    private String nombre;
    private String info;
    private String foto;
    private String situacion;
    private String altitud;
    private String latitud;
    private String longitud;
    private int id_sierra;

    //CONSTRUCTORES--------------------------------------------------------------

    public Refugio() {
    }

    public Refugio(int id, String nombre, String info, String foto, String situacion, String altitud, String latitud, String longitud, int id_sierra) {
        this.id = id;
        this.nombre = nombre;
        this.info = info;
        this.foto = foto;
        this.situacion = situacion;
        this.altitud = altitud;
        this.latitud = latitud;
        this.longitud = longitud;
        this.id_sierra = id_sierra;
    }

    //GETTERS Y SETTERS----------------------------------------------------------

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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public String getAltitud() {
        return altitud;
    }

    public void setAltitud(String altitud) {
        this.altitud = altitud;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public int getId_sierra() {
        return id_sierra;
    }

    public void setId_sierra(int id_sierra) {
        this.id_sierra = id_sierra;
    }
}
