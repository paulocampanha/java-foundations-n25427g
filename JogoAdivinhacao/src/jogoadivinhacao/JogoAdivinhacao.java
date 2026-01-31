/*
Jogo da Adivinhação: nesse jogo o usuario terá três chances de acertar
um número sorteado pelo programa
 */
package jogoadivinhacao;
import java.util.Random;
import javax.swing.JOptionPane;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Random rd = new Random();
        int numeroSecreto = rd.nextInt(100) + 1;
        int tentativas;
        int tentativasRestantes = 10;
        JOptionPane.showMessageDialog(
            null,
            "Você tem 10 tentativas para adivinhar um número entre 1 e 100",
            "Jogo da Adivinhação",
            1
        );
        String msg = "";
        while (tentativasRestantes > 0) {
            String tentativaStr = JOptionPane.showInputDialog(
                null,
                "Digite seu palpite:",
                "Jogo da Adivinhação",
                3
            );
            tentativas = Integer.parseInt(tentativaStr);
            if (tentativas == numeroSecreto){
                msg = "Parabéns! Você acertou o número secreto.";
                break;
            } else if (tentativas < numeroSecreto) {
                msg = "Seu palpite é menor do que o número secreto.";
                msg = msg + "Você tem " + tentativasRestantes;
            } else {
                msg = "Seu palpite é maior do que o número secreto.";
                msg = msg + "\nVocê tem " + tentativasRestantes + " tentativas restantes ";
            }
            JOptionPane.showMessageDialog(
                null, msg, "Jogo da Adivinhação", 2);
            tentativasRestantes--;
            
            if (tentativasRestantes == 0) {
                msg = "Você não acertou o número secreto.";
                msg = msg + "\nO número secreto era: " + numeroSecreto;
            }
        }
        JOptionPane.showMessageDialog(
            null, msg, "Jogo da Adivinhação", 1);
    }
}
