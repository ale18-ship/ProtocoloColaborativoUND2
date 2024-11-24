/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERICICIO2taller6;

/**
 *
 * @author asd
 */
public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);  // Llamada al constructor de la clase base
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();  // Muestra la información del vehículo
        System.out.println("Cilindrada: " + cilindrada + " cc");  // Muestra la cilindrada de la moto
    }
}
