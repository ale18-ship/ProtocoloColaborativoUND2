/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO1taller7;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan Pérez", 2500.0);
        Empleado empleado2 = new Empleado("María Gómez", -500.0);

        System.out.println("Empleado 1: " + empleado1.nombre + " - Salario: " + empleado1.getSalario());
        System.out.println("Empleado 2: " + empleado2.nombre + " - Salario: " + empleado2.getSalario());

        empleado1.setSalario(3000.0);
        System.out.println("Empleado 1 (después de cambiar salario): " + empleado1.nombre + " - Salario: " + empleado1.getSalario());

        empleado2.setSalario(-1000.0);
        System.out.println("Empleado 2 (después de intentar cambiar a salario negativo): " + empleado2.nombre + " - Salario: " + empleado2.getSalario());
    }
    
}
