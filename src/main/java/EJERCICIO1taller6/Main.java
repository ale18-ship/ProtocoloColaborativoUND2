/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO1taller6;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Gerente gerente = new Gerente("Carlos", 500000, "Recursos Humanos");

        gerente.mostrarInformacion();  // Llama al método sobrescrito en Gerente
    }
    
}
