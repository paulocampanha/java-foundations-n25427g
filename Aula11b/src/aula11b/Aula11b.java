/*
Nesse programa vamos usar a estrutura do while para 
verificar a entrada do usuário
 */
package aula11b;
import javax.swing.JOptionPane;
public class Aula11b {

    public static void main(String[] args) {
        double media;
        
        do {
            String mediaAluno = JOptionPane.showInputDialog(
                null, "Digite a média do aluno (0 a 100): ",
                "Escola Senai", 3
            );
            media = Double.parseDouble(mediaAluno);      
        } while (media < 0 || media > 100);
        
        if (media >= 50){
            JOptionPane.showMessageDialog(
                null, "Aluno Aprovado", "Escola Senai", 1);
        } else {
            JOptionPane.showMessageDialog(
                null, "Aluno Reprovado", "Escola Senai",1);
        }
        
    }
    
}
