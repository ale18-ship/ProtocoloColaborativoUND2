/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO1taller6;

/**
 *
 * @author asd
 */
public class Gerente extends Empleado {
    // Atributo específico de la clase Gerente
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario); // Llamada al constructor de la clase base
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento: " + departamento); 
    }
}