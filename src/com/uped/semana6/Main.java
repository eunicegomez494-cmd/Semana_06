package com.uped.semana6;

import com.uped.semana6.modelo.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA INTEGRAL - SEMANA 6 (CLASES ABSTRACTAS) ===\n");

        Persona[] personas = {
                new Cliente("Carlos Gómez", "01234567-8", "7890-1234", 1200.0),
                new Empleado("Laura Martínez", "02345678-9", 850.0),
                new Estudiante("Ana Hernández", "03456789-0", "HD20001", "Ingeniería", 9.2),
                new Docente("Ing. Oscar Contreras", "04567890-1", "Programación", 10),
                new Voluntario("Pedro Alvarenga", "05678901-2", 120.0),
                new Proveedor("Tech Solutions S.A.", "06789012-3", 5000.0)
        };

        for (Persona p : personas) {
            System.out.println("Rol: " + p.obtenerRol());
            System.out.println("Identificación: " + p.presentarse());
            System.out.println("Beneficio Anual: $" + p.calcularBeneficioAnual());
            System.out.println("---------------------------------------------------");
        }
    }
}