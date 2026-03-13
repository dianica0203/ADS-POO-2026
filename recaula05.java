/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.primeira.aula.poo;

/**
 *
 * @author Diane
 */
public class recaula05 {
    
    private Integer comprimento;
    private Integer largura;
    private Integer area;
    private Integer perimetro;
    
    
   public void calcularArea(){
      this.area = this.largura * this.comprimento;
       }
   
   public void calcularPerimetro(){
       this.perimetro = (2*this.comprimento) + (2*this.largura);
        }
   
   public void imprimir(){
       System.out.println(
       "comprimento =" + this.comprimento +
       "Largura = " + this.largura +
       "Area = " + this.area +
       "Perimetro = " + this.perimetro
       
       );
               
               
   }
}
