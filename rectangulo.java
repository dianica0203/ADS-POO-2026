/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.primeira.aula.poo;

import static java.time.Clock.system;

/**
 *
 * @author Diane
 */
public class rectangulo {
    
    double comprimento;
    double largura;
    double area;
    double perimetro;
    
    public void calcularArea(){
    this.area = comprimento * largura;
}

 public void calcularperimetro()
 {  
     this.perimetro = 2 * (comprimento + largura);
     
 }
 public void imprimir()
  {
      
  System.out.println("Comprimento:" + comprimento);
  
  System.out.println("Largura:" + largura);
  
  System.out.println("Àrea:" + area);
  
 System.out.print("perìmetro:"+ perimetro);
  }
}