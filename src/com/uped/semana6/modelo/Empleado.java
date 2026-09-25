package com.uped.semana6.modelo;

public class Empleado extends Persona {
    protected double salario;

    public Empleado(String nombre, String dui, double salario) {
        super(nombre, dui);
        this.salario = salario;
    }

    @Override
    public double calcularBeneficioAnual() {
        return salario * 0.10;
    }

    @Override
    public String obtenerRol() {
        return "Empleado Institucional";
    }
}