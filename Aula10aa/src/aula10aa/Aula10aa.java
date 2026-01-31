/*
Nesse programa vamos estudar a estrutura de repetição
while.
 */
package aula10aa;

import javax.swing.JOptionPane;

public class Aula10aa {

    public static void main(String[] args) {
        int contador = 1;
        
        while (contador <= 10){
            System.out.print(contador);

            if (contador < 10) {
                System.out.print(", ");
            }
            contador++;   // contador = contador + 1
        }
        System.out.println();
        System.out.println("=".repeat(40));
        System.out.println("Fim do Programa");
    }
    
}
