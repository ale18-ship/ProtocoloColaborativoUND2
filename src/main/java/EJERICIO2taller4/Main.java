/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERICIO2taller4;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 180);

        // Intentar acceder a las propiedades directamente (esto causará errores de compilación)
        // coche.marca = "Honda"; // Error: marca tiene modificador de acceso private
        // coche.modelo = "Civic"; // Error: modelo tiene modificador de acceso private
        // coche.velocidadMaxima = 200; // Error: velocidadMaxima tiene modificador de acceso private

        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Velocidad máxima: " + coche.getVelocidadMaxima());

        coche.acelerar(20);  // Incrementar la velocidad máxima
        coche.acelerar(-10); // Intentar un incremento negativo
    }
    
}
