/*
 * Nesse arquivo vamos estudar a importação de pacotes 
*/
package aula4b;

import java.util.Scanner;

/**
 *
 * @author sn1085640
 */
public class Aula4b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int numero = sc.nextInt();
        
        System.out.println("Numero digitado: " + numero);
        
        System.out.print("Digite o valor do produto: ");
        double valor = sc.nextDouble();
        String msg = String.format(
                "Valor digitado: R$ %,.2f", valor);
        System.out.println(msg);
        
        System.out.print("Digite o nome do curso: ");
        String curso = sc.next();
        
        System.out.println("Curso digitado: " + curso);
        
        System.out.print("Digite seu nome completo: ");
        sc.nextLine();
        String nomeCompleto = sc.nextLine();
        
        System.out.println("Nome completo: " + nomeCompleto);
        
        System.out.println("Vamos calcular uma potencia.");
        System.out.print("Digite a base da potencia: ");
        double base = sc.nextDouble();
        System.out.print("Digite o expoente da potencia: ");
        double expoente = sc.nextDouble();
        
        double potencia = Math.pow(base, expoente);
        msg = String.format(
                "o numero %.0f elevado a %.0f e igual a %.0f", 
                base, expoente, potencia);
        System.out.println(msg);
        
        double raiz = Math.sqrt(potencia);
        msg = String.format(
                "A raiz quadrade de %.0f e %f", potencia, raiz);
        System.out.println(msg);
                
        
        
    }
    
}
