/*
Nessa aula vamos estudar a estrutura de repetição do while
 */
package aula11a;

public class Aula11a {

    public static void main(String[] args) {
        int contador = 100;
        
        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador < 10);
        
        System.out.println("=".repeat(40));
        System.out.println("Fim do Programa");
    }
    
}
