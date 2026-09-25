package com.uped.semana6.modelo;

public class Proveedor extends Persona {
    private double montoFacturado;

    public Proveedor(String nombre, String dui, double montoFacturado) {
        super(nombre, dui);
        this.montoFacturado = montoFacturado;
    }

    @Override
    public double calcularBeneficioAnual() {
        return montoFacturado * 0.03;
    }

    @Override
    public String obtenerRol() {
        return "Proveedor Externo";
    }
}