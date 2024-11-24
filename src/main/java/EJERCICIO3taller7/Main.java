/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO3taller7;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Utilidades util = new Utilidades();

        double suma = util.sumar(5.5, 3.2);
        System.out.println("Suma: 5.5 + 3.2 = " + suma);

        double resta = util.restar(10.0, 4.5);
        System.out.println("Resta: 10.0 - 4.5 = " + resta);

        double multiplicacion = util.multiplicar(6.0, 7.5);
        System.out.println("Multiplicación: 6.0 * 7.5 = " + multiplicacion);

        double division = util.dividir(20.0, 4.0);
        System.out.println("División: 20.0 / 4.0 = " + division);

        double divisionPorCero = util.dividir(20.0, 0);
        System.out.println("División por cero: 20.0 / 0 = " + divisionPorCero);
    }
    
}
