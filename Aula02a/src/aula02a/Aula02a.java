/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02a;

/**
 *
 * @author sn1085640
 */
public class Aula02a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tipos primitivos para número inteiro
        byte idade;         // Declaração da variavel do tipo byte
        idade = 18;
        short ano = 2025;
        int populacao = 9456794;
        long populacaoMundial = 8_000_000_000L;
        System.out.println("Tipos primitivos para inteiros");
        System.out.println("Idade do aluno: " + idade);
        System.out.println("Ano atual: " + ano);
        System.out.println("População de Madagascar: " + populacao);
        System.out.println("População mundial: " + populacaoMundial +
                " de pessoas");
        
        // Tipos primitivos para números decimais
        float preco = 3452.49F;
        double pi = 3.14159265359;
        
        System.out.printf("Preço do Notebook: %.2f %n", preco);
        System.out.printf("Número do PI: %.5f %n", pi);
        
        // Tipo primitivbo para valores boleanos (lógicos)
        boolean estaLogado = true;
        boolean temPermissao = false;
        
        // Tipo primitivo para caracteres de único elemento
        char letraInicial = 'P';
        char numeroSorteado = '7';
        
        
        
    }
    
}
