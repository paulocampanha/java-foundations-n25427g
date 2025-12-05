/*
 * Nesse programa vamos estudar a classe JOptionPane do 
 * pacote javax.swing
 */
package aula5c;
import javax.swing.JOptionPane;

public class Aula5c {

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog(
                null,
                "Digite seu nome: ",
                "Entrada de Dados",
                2);
        
        JOptionPane.showMessageDialog( 
                null, 
                "Seu nome é " + nome,
                "Saída de Dados",
                3);
        
        int opcao = JOptionPane.showConfirmDialog(
                null,
                "Deseja salvar os dados?",
                "Confirmação Necessária",
                JOptionPane.YES_NO_OPTION,
                3
        ); 
        System.out.println("Opcao: " + opcao);
    }
    
}
