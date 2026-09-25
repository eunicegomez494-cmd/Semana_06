# Auditoría de Clases Abstractas - Semana 6

## 1. Refactorización de la Clase Persona
Se transformó la clase `Persona` en una **clase abstracta** (`public abstract class Persona`), impidiendo la instanciación directa de objetos base.

## 2. Métodos Abstractos
Se obligó a todas las subclases a definir la implementación particular de los métodos:
- `calcularBeneficioAnual()`
- `obtenerRol()`

## 3. Demostración de Polimorfismo
El archivo `Main.java` gestiona un arreglo heterogéneo de tipo `Persona[]` donde cada subclase responde con su propio comportamiento dinámico en tiempo de ejecución.