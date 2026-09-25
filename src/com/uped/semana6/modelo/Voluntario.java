package com.uped.semana6.modelo;

public class Voluntario extends Persona {
    private double horasServicio;

    public Voluntario(String nombre, String dui, double horasServicio) {
        super(nombre, dui);
        this.horasServicio = horasServicio;
    }

    @Override
    public double calcularBeneficioAnual() {
        return horasServicio * 2.0;
    }

    @Override
    public String obtenerRol() {
        return "Voluntario Social";
    }
}