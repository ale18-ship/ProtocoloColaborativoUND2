/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO2taller5.Vehiculo;

/**
 *
 * @author asd
 */
public class Moto extends Vehiculo {
    int cilindrada;

    public Moto(String tipo, int cilindrada) {
        super(tipo);  // Llama al constructor de la clase Vehiculo
        this.cilindrada = cilindrada;
    }

    public void mostrarInfo() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Cilindrada: " + cilindrada);
    }
}
