/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERICIO2taller4;

/**
 *
 * @author asd
 */
public class Coche {
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(int incremento) {
        if (incremento > 0) {
            this.velocidadMaxima += incremento;
            System.out.println("Velocidad máxima incrementada a: " + this.velocidadMaxima);
        } else {
            System.out.println("Error: El incremento debe ser positivo.");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }    
}
