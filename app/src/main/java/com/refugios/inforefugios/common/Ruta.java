package com.refugios.inforefugios.common;

public class Ruta {
    //ATRIBUTOS--------------------------------------------------------------
    private int id;
    private int id_refugio;
    private String kml;
    private String imagen;
    private String nombre;

    //CONSTRUCTORES-----------------------------------------------------------

    public Ruta() {
    }

    public Ruta(int id, int id_refugio, String kml, String imagen, String nombre) {
        this.id = id;
        this.id_refugio = id_refugio;
        this.kml = kml;
        this.imagen = imagen;
        this.nombre = nombre;
    }

    //GETTERS Y SETTERS-----------------------------------------------------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_refugio() {
        return id_refugio;
    }

    public void setId_refugio(int id_refugio) {
        this.id_refugio = id_refugio;
    }

    public String getKml() {
        return kml;
    }

    public void setKml(String kml) {
        this.kml = kml;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}