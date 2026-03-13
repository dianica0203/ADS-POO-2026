/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.primeira.aula.poo;

/**
 *
 * @author Diane
 */
public class Carro {
    
    public boolean estadoVeiculo; // true = ligado, false = desligado
    public String marca;
    public String modelo;
    public String placa;
    public String nomeDoDono;
    public String chassi;
    public int velocimetro;

    
    public Carro(String marca, String modelo, String placa, String nomeDoDono, String chassi) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.nomeDoDono = nomeDoDono;
        this.chassi = chassi;
        this.estadoVeiculo = false; 
        this.velocimetro = 0;       
    }

    // Métodos
    public void ligar() {
        this.estadoVeiculo = true;
        System.out.println("O carro foi ligado.");
    }

    public void desligar() {
        this.estadoVeiculo = false;
        this.velocimetro = 0; // Se desligar, o carro para
        System.out.println("O carro foi desligado.");
    }

    public void acelerar() {
        if (estadoVeiculo) {
            this.velocimetro += 10;
            System.out.println("Acelerando... Velocidade atual: " + velocimetro + " km/h");
        } else {
            System.out.println("Não é possível acelerar com o carro desligado!");
        }
    }

    public void frear() {
        if (velocimetro >= 10) {
            this.velocimetro -= 10;
            System.out.println("Freando... Velocidade atual: " + velocimetro + " km/h");
        } else {
            this.velocimetro = 0;
            System.out.println("O carro já está parado.");
        }
    }

    public void imprimir() {
        System.out.println("\n--- RELATÓRIO DO VEÍCULO ---");
        System.out.println("Dono: " + nomeDoDono);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Chassi: " + chassi);
        System.out.println("Estado: " + (estadoVeiculo ? "Ligado" : "Desligado"));
        System.out.println("Velocidade Atual: " + velocimetro + " km/h");
        System.out.println("----------------------------\n");
    }
}