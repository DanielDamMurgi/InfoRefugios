package com.refugios.inforefugios.common;

import java.io.Serializable;

public class Usuario implements Serializable {
    //ATRIBUTOS-----------------------------------------------------------
    private int id;
    private String email;
    private String nombre;
    private String clave;

    //CONSTRUCTORES-------------------------------------------------------
    public Usuario() {
    }

    public Usuario(int id,String email, String nombre , String clave) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.clave = clave;
    }

    //GETTERS Y SETTERS------------------------------------------------------
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

}
