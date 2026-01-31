/*

Nesse programa vamos estudar a estrutura switch-case
e o método JOptionPane.showOptionDialog
*/
package aula9c;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Aula9c {
    public static void main(String[] args) {
        String titulo = "Cursos Disponíveis";
        Object[] opcoes = {"Java", "Python", "Excel", "AWS"};
        
        int resposta = JOptionPane.showOptionDialog(
            null,
            "Selecione o curso desejado:",
            titulo,
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]
            );
        switch (resposta){
            case 0:
                JOptionPane.showMessageDialog(
                    null,
                    "Curso de Java escolhido",
                    titulo,
                    1
                );
                break;
            case 1:
                JOptionPane.showMessageDialog(
                    null,
                    "Curso de Python escolhido",
                    titulo,
                    1
                );
                break;
            case 2:
                JOptionPane.showMessageDialog(
                    null,
                    "Curso de Excel escolhido",
                    titulo,
                    1
                );
                break;
            case 3:
                JOptionPane.showMessageDialog(
                    null,
                    "Curso de AWS escolhido",
                    titulo,
                    1
                );
                break;
            default:
                JOptionPane.showMessageDialog(
                    null,
                    "Nenhum curso escolhido.",
                    titulo,
                    1
                );                
        }
    }
    
}
