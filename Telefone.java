/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.primeira.aula.poo;

/**
 *
 * @author Diane
 */

class Telefone {
   
    public String marca;
    public String modelo;
    public String estadoTelefone;

    
    public Telefone(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.estadoTelefone = "Desligado"; 

    }
    public void ligarSmartphone() {
        this.estadoTelefone = "Ligado";
        System.out.println("O smartphone está iniciando...");
    }

    public void desligarSmartphone() {
        this.estadoTelefone = "Desligado";
        System.out.println("O smartphone foi desligado.");
    }

    public void ligarParaContato() {
        if (this.estadoTelefone.equals("Desligado")) {
            System.out.println("Erro: Não é possível ligar com o telefone desligado!");
        } else {
            this.estadoTelefone = "Em chamada";
            System.out.println("Chamada em curso...");
        }
    }

    public void desligarChamada() {
        if (this.estadoTelefone.equals("Em chamada")) {
            this.estadoTelefone = "Ligado";
            System.out.println("Chamada encerrada.");
        } else {
            System.out.println("Não há nenhuma chamada ativa para desligar.");
        }
    }

        public void imprimir() {
        System.out.println("\n--- Status Atual do Telefone ---");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Estado Atual: " + this.estadoTelefone);
        System.out.println("--------------------------------\n");
    }
}
 class Main {
    public static void main(String[] args) {
        
        Telefone meuCelular = new Telefone("Samsung", "Galaxy S24");

        
        meuCelular.ligarSmartphone();
        meuCelular.ligarParaContato();
        meuCelular.desligarChamada();
        
                meuCelular.imprimir();
    }
}