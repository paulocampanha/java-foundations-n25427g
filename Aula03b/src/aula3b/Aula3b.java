/*
 * Nesse arquivo vamos estudar os operadores do java
*/
package aula3b;

/**
 *
 * @author sn1085640
 */
public class Aula3b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1 = 29;
        double num2 = 13;
        System.out.println("Operacoes com " + num1 + " e " + num2);
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtracao: " + (num1 - num2));
        System.out.println("Multiplicao: " + (num1 * num2));
        System.out.println("Divisao: " + (num1 / num2));
        System.out.println("Modulo: " + (num1 % num2));
        
        System.out.println("=".repeat(50));
        int nivel = 50;
        double nivelDecimal = nivel;  //casting implícito
        
        System.out.println("Nivel decimal: " + nivelDecimal);
        
        double preco = 12.99;
        int precoInteiro = (int) preco;
        
        System.out.println("Preco inteiro: " + precoInteiro);
        
        String idadeStr = "25";
        int idade = Integer.parseInt(idadeStr);
        
        String valorStr = "256.29";
        double valor =  Double.parseDouble(valorStr);
        
        System.out.println("Idade: " + idade);
        System.out.println("Valor: " + valor);
        
        int a = 10;
        int b = 25;
        int c = 3;
        int valor1 = a * b + c;
        int valor2 = a * (b + c);
        
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);
                
        
    }
}
