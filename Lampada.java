/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.primeira.aula.poo;

/**
 *
 * @author Diane
 */

 public class Lampada {
   
    public String marca;
    public String modelo;
    public int potencia; 
    public boolean estadoLampada; 

    
    public Lampada(String marca, String modelo, int potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.estadoLampada = false; 
    }

   
    public void ligar() {
        this.estadoLampada = true;
        System.out.println("A lâmpada foi ligada.");
    }

    
    public void desligar() {
        this.estadoLampada = false;
        System.out.println("A lâmpada foi desligada.");
    }

    
    public void imprimir() {
        String status = this.estadoLampada ? "Ligada" : "Desligada";
        
        System.out.println("\n--- Dados da Lâmpada ---");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Potência: " + this.potencia + "W");
        System.out.println("Estado Atual: " + status);
        System.out.println("------------------------\n");
    }
}

class Main {
    public static void main(String[] args) {
       
        Lampada minhaLampada = new Lampada("Philips", "LED Bulbo", 9);
        minhaLampada.ligar();
        
        minhaLampada.desligar();
        minhaLampada.ligar();

       
        minhaLampada.imprimir();
    }
}