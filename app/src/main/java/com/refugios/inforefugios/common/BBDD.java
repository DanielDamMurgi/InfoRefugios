package com.refugios.inforefugios.common;

public class BBDD {

    private static final String IP = "https://es.000webhost.com/members/website/rooky-fur/database";
    private static final String BD = "/id7936051_inforefugios";
    private static final String USUARIO = "id7936051_danielrueda";
    private static final String CLAVE = "D1N32LR";

    public static String getIp() {
        return IP;
    }

    public static String getBd() {
        return BD;
    }

    public static String getUsuario() {
        return USUARIO;
    }

    public static String getClave() {
        return CLAVE;
    }
}
