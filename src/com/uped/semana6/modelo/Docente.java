package com.uped.semana6.modelo;

public class Docente extends Persona {
    private String especialidad;
    protected int aniosExperiencia;

    public Docente(String nombre, String dui, String especialidad, int aniosExperiencia) {
        super(nombre, dui);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public double calcularBeneficioAnual() {
        return aniosExperiencia * 45.0;
    }

    @Override
    public String obtenerRol() {
        return "Docente Académico";
    }
}