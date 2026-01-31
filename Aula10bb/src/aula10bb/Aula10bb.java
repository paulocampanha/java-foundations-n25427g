/*
Nesse programa vanos continuar estudando o uso do
while
 */
package aula10bb;
import javax.swing.JOptionPane;

public class Aula10bb {

    public static void main(String[] args) {
        String limiteString = JOptionPane.showInputDialog(
            null,
            "Digite o limite para impressao da sequencia: ",
            "Contagem",
            1
        );
        int limite = Integer.parseInt(limiteString);
        int contador = 0;
        String msg = "";
        while (contador <= limite){
            msg = msg + contador + ", "; // 0, 1, 2,
            if (contador % 10 == 0 && contador != 0){
                msg = msg + "\n";
            }
            contador++;
        }
        JOptionPane.showMessageDialog(
            null,
            msg,
            "Contagem",
            1
            );
    }
    
}
