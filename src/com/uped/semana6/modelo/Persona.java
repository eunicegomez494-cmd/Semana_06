package com.uped.semana6.modelo;

public abstract class Persona {
    protected String nombre;
    protected String dui;

    public Persona(String s, String nombre) {
        this.nombre = nombre;
        this.dui = dui;
    }

    public String presentarse() {
        return nombre + " (DUI: " + dui + ")";
    }

    public abstract double calcularBeneficioAnual();
    public abstract String obtenerRol();
}