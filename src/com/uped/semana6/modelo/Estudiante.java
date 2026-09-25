package com.uped.semana6.modelo;

public class Estudiante extends Persona {
    private String carnet;
    private String carrera;
    private double promedio;

    public Estudiante(String nombre, String dui, String carnet, String carrera, double promedio) {
        super(nombre, dui);
        this.carnet = carnet;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    @Override
    public double calcularBeneficioAnual() {
        return promedio >= 8.5 ? 500.0 : 0.0;
    }

    @Override
    public String obtenerRol() {
        return "Estudiante Activo";
    }
}