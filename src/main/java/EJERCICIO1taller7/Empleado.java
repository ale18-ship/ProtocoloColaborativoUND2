/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO1taller7;

/**
 *
 * @author asd
 */
public class Empleado {
    public String nombre;

    private double salario;

    // Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public final void setSalario(double salario) {
        if (salario < 0) {
            System.out.println("El salario no puede ser negativo.");
        } else {
            this.salario = salario;
        }
    }    
}
