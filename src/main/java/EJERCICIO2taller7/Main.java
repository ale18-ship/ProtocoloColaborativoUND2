/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO2taller7;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("123456789", 1000.0, "Ahorros");

        System.out.println("Saldo: " + cuenta1.getSaldo());

        cuenta1.setSaldo(2000.0);
        System.out.println("Saldo después de actualización: " + cuenta1.getSaldo());

        cuenta1.mostrarDetalles();
    }
    
}
