/*
Nesse programa vamos estudar a estrutura if else
com o método showConfirmDialog da classe 
JOptionPane
 */
package aula8d;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Aula8d {

    public static void main(String[] args) {
        // Define os novos textos para os botões
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.cancelButtonText", "Cancelar");
        int opcao = JOptionPane.showConfirmDialog(
            null,
            "Deseja continuar?",
            "Confirmação",
            JOptionPane.YES_NO_OPTION,
            3
        );
        if (opcao == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(
                null,
                "Continuação solicitado pelo usuário.",
                "Confirmação",
                1);
        } else {
            JOptionPane.showMessageDialog(
                null,
                "Continuação negada pelo usuário.",
                "Confirmação",
                1);
        }
        
    }
    
}
