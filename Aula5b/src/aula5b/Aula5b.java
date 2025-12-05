/*
 * Nesse programa vamos estudar a classe Random. Esse classe 
 * possui metodos para sortear um número aleatorio. 
 * O pacote Random precisa ser importado
*/
package aula5b;
import java.util.Random;

public class Aula5b {

    public static void main(String[] args) {
        Random rd = new Random();
        // Gerando um número entre 0 e 9
        int numero = rd.nextInt(10);
        System.out.println("Numero sorteado: " + numero);
        System.out.println("=".repeat(40));
        numero = rd.nextInt(60) + 1;
        System.out.println("Numero  para MegaSena: " + numero);
        System.out.println("=".repeat(40));
        // Gerando um número aleatório entre 0.0 e 0.999999999999999
        double valor = rd.nextDouble();
        System.out.println("Numero decimal: " + valor);
        double valor2 = valor * 1000;
        System.out.println("Novo decimal: " + valor2);
        int valor3 = (int) Math.round(valor2);
        System.out.println("Novo inteiro: " + valor3);
        
        
        
        
    }
    
}
