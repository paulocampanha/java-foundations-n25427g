/*
 * Nesse programa vamos revisar os conceito da classe JOptionPane, Random e Math. 
 */
package aula6a;
import java.time.Year;
import javax.swing.JOptionPane;
import java.util.Random;

public class Aula6a {

    public static void main(String[] args) {
        String titulo = "Sistema de Gestão";
        JOptionPane.showMessageDialog(
                null,
                "Seja bem vindo ao Sistema de Gestão",
                titulo,
                JOptionPane.INFORMATION_MESSAGE
        );
        
        String nome = JOptionPane.showInputDialog(
            null,
            "Digite seu nome",
            titulo,
            3
        );
        
        String baseString = JOptionPane.showInputDialog(
                null,
                "Digite a base da potência",
                titulo,
                3
        );
        String expoenteString = JOptionPane.showInputDialog(
                null,
                "Digite o expoente da potência",
                titulo,
                3
        );
        double base = Double.parseDouble(baseString);
        double expoente = Double.parseDouble(expoenteString);
        double potencia = Math.pow(base, expoente);
        String msg = String.format(
            "O número %.0f elevado a %.0f resulta na potência %.0f. ",
            base, expoente, potencia, nome);  
        JOptionPane.showMessageDialog(
                null,
                msg,
                titulo,
                1
        );
        
        Random rd = new Random();
        int num1 = rd.nextInt(60) + 1;
        int num2 = rd.nextInt(60) + 1;
        int num3 = rd.nextInt(60) + 1;
        int num4 = rd.nextInt(60) + 1;
        int num5 = rd.nextInt(60) + 1;
        int num6 = rd.nextInt(60) + 1;
        msg = String.format(
        "Numeros da MegaSena da Virada: %d, %d, %d, %d, %d, %d. Boa sorte!",
                num1, num2, num3, num4, num5, num6);
        JOptionPane.showMessageDialog(
                null,
                msg,
                titulo,
                2
        );
        
        //import java.time.Year;
        Year ano = Year.now();  // 
        int anoAtual = ano.getValue();
    }
    
}
