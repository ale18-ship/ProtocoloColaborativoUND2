/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERICICIO1taller4;

/**
 *
 * @author asd
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacío.");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
    if (edad > 0) {
        this.edad = edad;
    } else {
        System.out.println("Error: Edad inválida. Debe ser mayor que 0.");
    }
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0 && notaPromedio <= 10) {
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("Error: Nota promedio inválida. Debe estar entre 0 y 10.");
        }
    }    
}
