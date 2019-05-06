package com.refugios.inforefugios.common;

import java.io.Serializable;

public class Sierra implements Serializable {
    //ATRIBUTOS----------------------------------------------------
    private int id;
    private String nombre;
    private String info;
    private String foto;
    private String latutud;
    private String longitud;

    //CONSTRUCTORES------------------------------------------------
    public Sierra() {

    }

    public Sierra(String nombre, String foto) {
        this.nombre = nombre;
        this.foto = foto;
    }

    public Sierra(int id, String nombre, String info, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.info = info;
        this.foto = foto;
    }

    public Sierra(int id, String nombre, String info, String foto, String latutud, String longitud) {
        this.id = id;
        this.nombre = nombre;
        this.info = info;
        this.foto = foto;
        this.latutud = latutud;
        this.longitud = longitud;
    }

    //GETTERS Y SETTERS---------------------------------------------

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

    public String getLatutud() {
        return latutud;
    }

    public void setLatutud(String latutud) {
        this.latutud = latutud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
}
