/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERICICIO1taller4;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();

        estudiante.setNombre("Alexis Cera");
        estudiante.setEdad(20);
        estudiante.setNotaPromedio(8.5);

        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Nota Promedio: " + estudiante.getNotaPromedio());

        estudiante.setEdad(-5); // Edad inválida
        estudiante.setNotaPromedio(15); // Nota inválida
    }
    
}
