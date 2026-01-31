/* Nesse programa vamos estudar a classe String e revisar os principai tipos
   primitivos.
 */
package aula3a;

/**
 *
 * @author sn1085640
 */
public class Aula3a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade = 18;
        double altura = 1.75;
        boolean alunoAusente = false;
        String nome = "Gaspar";
        char texto = 'p';
  
        System.out.println("Nome original: " + nome);
        System.out.println("Nome maiúsculo: " + nome.toUpperCase());
        System.out.println("Nome minúsulo: " + nome.toLowerCase());
        System.out.println("Idade: " + idade);
        System.out.println("=".repeat(50));
        System.out.println("Número de letras do nome: " + nome.length());
        
    }
    
}
