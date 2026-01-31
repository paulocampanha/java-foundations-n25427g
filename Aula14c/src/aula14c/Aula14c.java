/*
Nesse programa vamos criar um array com números 
sorteados aleatoriamente
 */
package aula14c;
import java.util.Random;
import javax.swing.JOptionPane;
public class Aula14c {

    public static void main(String[] args) {
        
        int[] numerosSorteados = new int[6];
        Random gerador = new Random();
        int posicaoAtual = 0;
        
        while (posicaoAtual < numerosSorteados.length){
            int numeroSorteado = gerador.nextInt(60) + 1;
            boolean jaExiste = false;
            // 34, 57, 12, 23, 7
            // Verificação: Percorre o array até 
            // onde já foi preenchido
            for (int i = 0; i < posicaoAtual; i++){
                if (numerosSorteados[i] == numeroSorteado){
                    jaExiste = true;
                    break;
                }
            }
            
            // Se não existir, insere no array e 
            // avança a posição
            if (!jaExiste) {
                numerosSorteados[posicaoAtual] = numeroSorteado;
                posicaoAtual++;
            }
        }
        
        String msg = "";
        for (int num : numerosSorteados){
            msg += num + " ";
        }
        JOptionPane.showMessageDialog(null, msg);
        
    }
    
}
