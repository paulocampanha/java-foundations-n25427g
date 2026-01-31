/*
Nesse programa vamos usar a estrutura while para somar 
números fornecidos pelo usuário
 */
package aula10cc;
import javax.swing.JOptionPane;

public class Aula10cc {

    public static void main(String[] args) {
        double soma = 0;
        int resposta = 0;
        
        while (resposta == 0) {
            String num = JOptionPane.showInputDialog(
                null,
                "Digite um número para soma: ",
                "Calculadora Simples",
                3
            );
            num = num.replace(",", ".");
            soma = soma + Double.parseDouble(num);
            resposta = JOptionPane.showConfirmDialog(
                null,
                "Deseja inserir outro número?",
                "Calculadora Simples",
                JOptionPane.YES_NO_OPTION,
                3);
        }
        JOptionPane.showMessageDialog(
            null,
            "A soma dos número digitados é " + soma,
            "Calculadora Simples",
            1);
    }
}
