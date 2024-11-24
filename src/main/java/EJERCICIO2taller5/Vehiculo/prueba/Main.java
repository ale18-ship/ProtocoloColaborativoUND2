/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO2taller5.Vehiculo.prueba;

import EJERCICIO2taller5.Vehiculo.Moto;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto de tipo Moto
        Moto moto = new Moto("Deportiva", 600);

        moto.mostrarInfo();  // Esto funcionará porque mostrarInfo() es público
   
 }
}