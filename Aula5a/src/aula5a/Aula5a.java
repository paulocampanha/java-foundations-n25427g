/*
 * Nesse programa vamos continuar estudando importação de pacotes e vamos fazer
 * um revisão da aula anterior
 */
package aula5a;
import java.util.Scanner;

public class Aula5a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String traco = "=".repeat(40);
        System.out.print("Digite a base da potencia: ");
        double base = sc.nextDouble();  
        System.out.print("Digite o expoente da potencia: ");
        double expoente = sc.nextDouble();
        // Potência: Math.pow(base, expoente)
        double potencia = Math.pow(base, expoente);
        String msg = String.format(
        "O numero %.0f elevado a %.0f e igual a %.0f",
                base, expoente, potencia);
        System.out.println(msg);
        System.out.println(traco);
        System.out.print(
            "Digite um número para saber a raiz quadrada: ");
        // Raiz quadrada: Math.sqrt()
        double numeroRaiz = sc.nextDouble();
        double raiz = Math.sqrt(numeroRaiz);
        msg = String.format(
                "A Raiz Quadadra de %.0f e igual a %.0f",
                numeroRaiz, raiz);
        System.out.println(msg);
        System.out.println(traco);
        System.out.print("Digite um numero decimal: ");
        double numeroDecimal = sc.nextDouble();
        // Arredondamento: Math.round(numeroDecimal)
        // Arredonda para um npumero inteiro do tipo long
        // O cast 'int' converte o número arredondado para inteiro
        int arredondado = (int) Math.round(numeroDecimal);
        msg = String.format("Numero arredondado %d", arredondado);
        System.out.println(msg);
        
               
        
        
                
    }
    
}
