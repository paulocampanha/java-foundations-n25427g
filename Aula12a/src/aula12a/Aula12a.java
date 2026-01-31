/*
Nesse programa vamos impimir uma lista de produtos divididos
por prateleira. Cada prateira pode receber 50 produtos.
 */
package aula12a;
import javax.swing.JOptionPane;

public class Aula12a {

    public static void main(String[] args) {
        String nomeProduto = JOptionPane.showInputDialog(
            null,
            "Digite o nome do produto: ",
            "Senai Logística",
            3
        );
        String quantidadeProduto = JOptionPane.showInputDialog(
            null,
            "Digite a quantidade de entrada do produto (máxino 500): ",
            "Senai Logística",
            3
        );
        int quantidade = Integer.parseInt(quantidadeProduto);
        int prateleiras = quantidade / 50;
        int sobra = quantidade % 50;
        String msg = "";
        int contador = 1;
        while (contador <= prateleiras) {
            msg = msg + "Prateleira " + contador + ": 50 peças\n";
            contador += 1;
        }
        if (sobra > 0) {
            msg = msg + "Prateleira " + contador + ": " + sobra +" peças";
        }
        JOptionPane.showMessageDialog(
            null,
            msg,
            "Senai Logística",
            1
        );
        
    }
    
}
