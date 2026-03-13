/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.primeira.aula.poo;

/**
 *
 * @author Diane
 */
import javax.swing.JOptionPane;

public class Aluno7 {
   
    private final String nome;
    private String matricula;
    private String status; 

        public Aluno7() {
        this.nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
        this.status = "Não Matriculado"; 
        this.matricula = "N/A";          
    }

   
    public void matricular() {
        this.matricula = JOptionPane.showInputDialog("Digite o número de matrícula para " + this.nome + ":");
        this.status = "Matriculado";
        JOptionPane.showMessageDialog(null, "Matrícula realizada com sucesso!");
    }

   
    public void trancarMatricula() {
        if (this.status.equals("Matriculado")) {
            this.status = "Matrícula Trancada";
            JOptionPane.showMessageDialog(null, "Matrícula de " + this.nome + " foi trancada.");
        } else {
            JOptionPane.showMessageDialog(null, "Não é possível trancar: o aluno não está matriculado.");
        }
    }

    
    public void imprimir() {
        String mensagem = """
                          --- DADOS DO ALUNO ---
                          Nome: """ + this.nome + "\n" +
                          "Matrícula: " + this.matricula + "\n" +
                          "Status: " + this.status + "\n" +
                          "----------------------";
        
        
        System.out.println(mensagem);
        
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}