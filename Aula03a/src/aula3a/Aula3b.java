/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3a;

/**
 *
 * @author sn1085640
 */
public class Aula3b {
    
    public static void main(String args[]){
        String nome = "Gaspar";
        String sobrenome = "Galego";
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println("Nome completo: " + nomeCompleto);
        
        String mensagemNula = null;
        String mensagemVazia = "";
        System.out.println("Mensagem nula: " + mensagemNula);
        System.out.println("Mensagem vazia: " + mensagemVazia);
        
        String frase = "     A pipoca fugiu da panela.     ";
        System.out.println(frase);
        System.out.println(frase.trim());
        
        String fimDaFrase = frase.substring(14);
        System.out.println(fimDaFrase);
        String meioDaFrase = frase.substring(7, 19);
        System.out.println(meioDaFrase);
        
        // Verifica se a variavel está vazia.
        System.out.println(frase.isEmpty());  
        System.out.println(mensagemVazia.isEmpty());
        
    }
}
