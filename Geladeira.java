/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.primeira.aula.poo;

/**
 *
 * @author Diane
 */
public class Geladeira {
    
    
     private boolean ligado = false;
    boolean portaFechada = true; 
    
    
    void ligarGeladeira() {
        ligado = true;
        System.out.println("A geladeira foi ligada.");
    }

    void desligarGeladeira() {
        ligado = false; 
        System.out.println("A geladeira foi desligada.");
    }

    void abrirPorta() {
        portaFechada = false; 
        System.out.println("Você abriu a porta.");
    }

    void fecharPorta() {
        portaFechada = true;
        System.out.println("Você fechou a porta.");
    }
     
    void imprimir() {
        System.out.println("--- Status Atual ---");
        System.out.println("Geladeira ligada: " + (ligado ? "Sim" : "Não"));
        System.out.println("Porta fechada: " + (portaFechada ? "Sim" : "Não"));
        System.out.println("--------------------");
    }
}


class Main {
    public static void main(String[] args) { 
       
        Geladeira g1 = new Geladeira(); 
        
        g1.ligarGeladeira();
        g1.abrirPorta();
        g1.desligarGeladeira();
        g1.fecharPorta();
       
        g1.imprimir();
    }
}