/*
Nesse programa vamos usar a estrutura 'for' para criar uma contagem 
regressiva
 */
package aula11d;
import javax.swing.JOptionPane;

public class Aula11d {

    public static void main(String[] args) {
        
        for (int i = 5; i > 0; i--){
            JOptionPane.showMessageDialog(
                null, i,"Contagem Regressiva",                
                JOptionPane.OK_OPTION);
        }
        JOptionPane.showMessageDialog(
            null, "F O G O ! ! !",
            "Contagem Regressiva", 1);
    }
    
}
