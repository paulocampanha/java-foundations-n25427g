/*
Nesse programa vamos estudar o uso da estrutura de
decisão if else
 */
package aula8a;
import javax.swing.JOptionPane;

public class Aula8a {

    public static void main(String[] args) {
        String numeroString = JOptionPane.showInputDialog(
            null,
            "Digite um número inteiro",
            "Verificação de Número Par ou Ímpar",
            1
        );
        
        int numero = Integer.parseInt(numeroString);
        
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(
                null,
                "O número digitado é Par",
                "Verificação de Número Par ou Ímpar",
                1);
        } else {
            JOptionPane.showMessageDialog(
                null,
                "O número digitado é Ímpar",
                "Verificação de Número Par ou Ímpar",
                1);
        }
    }
    
}
