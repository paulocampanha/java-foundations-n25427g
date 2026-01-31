/*
Nesse programa vamos estudar a estrutura if else usando o operador
lógico '&&' (and)
 */
package aula8c;
import javax.swing.JOptionPane;

public class Aula8c {
    public static void main(String[] args) {
        int estoqueCritico = 100;
        boolean essencial = true;
        int estoqueAtual = 500;
        
        String saidaString = JOptionPane.showInputDialog(
            null,
            "Digite a quantidade para retirada",
            "Controle de Estoque",
            1
        );
        int saida = Integer.parseInt(saidaString);
        if (saida <= estoqueAtual){
            estoqueAtual -= saida;
        } else {
            JOptionPane.showMessageDialog(
                null,
                "Quantidade solicitada indisponível.",
                "Controle de estoque",
                3
            );
        }
        
        if (estoqueAtual <= estoqueCritico && essencial){
            JOptionPane.showMessageDialog(null,
                "ALERTA CRÍTICO! Reposição do produto urgente",
                "Controle de Estoque",
                3);
        } else {
            JOptionPane.showMessageDialog(null,
                "Estoque sob controle",
                "Controle de Estoque",
                1);
        }
        
    }
    
}
