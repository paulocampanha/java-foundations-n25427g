/*
Nesse programa vamos usar a estrutura while
para imprimir uma tabuada escolhida pelo 
usuário
 */
package aula10dd;
import javax.swing.JOptionPane;

public class Aula10dd {

    public static void main(String[] args) {
        int contador = 1;
        int limite = 10;
        int total = 0;
        String msg = "";
        String num = JOptionPane.showInputDialog(
                null,
                "Digite um número inteiro para tabuada:",
                "Gerador de Tabuada",
                3
            );
        while (contador <= limite){            
            total = contador * Integer.parseInt(num);
            msg = msg + String.format("%s X %d = %d%n",num, contador, total );
            contador++;
        }
        JOptionPane.showMessageDialog(
            null,
            msg,
            "Gerador de Tabuada",
            1
        );
    }
    
}
