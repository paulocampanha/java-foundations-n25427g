/*
Nesse programa vamos estudar a estrutura de 
desvio condicional switch-case
 */
package aula9a;
import javax.swing.JOptionPane;

public class Aula9a {

    public static void main(String[] args) {
        String diaSemana = JOptionPane.showInputDialog(
            null,
            "Digite o número do dia da semana: \n"
            + "(Exemplo: 1 para Domingo, \n"
            + "2 para Segunda-Feira, etc",
            "Determinando dia da Semana",
            3
        );
        int dia = Integer.parseInt(diaSemana);
        switch (dia) {
            case 1:
                JOptionPane.showMessageDialog(
                    null,
                    "Hoje é Domingo",
                    "Determinando dia da Semana",
                    1
                );
                break;
            case 2:
                JOptionPane.showMessageDialog(
                    null,
                    "Hoje é Segunda-Feira",
                    "Determinando dia da Semana",
                    1
                );
                break;                
            case 3:
                JOptionPane.showMessageDialog(
                    null,
                    "Hoje é Terça-Feira",
                    "Determinando dia da Semana",
                    1
                );
                break;
            case 4:
                JOptionPane.showMessageDialog(
                    null,
                    "Hoje é Quarta-Feira",
                    "Determinando dia da Semana",
                    1
                );
                break;
            case 5:
                JOptionPane.showMessageDialog(
                    null,
                    "Hoje é Quinta-Feira",
                    "Determinando dia da Semana",
                    1
                );
                break;
            case 6:
                JOptionPane.showMessageDialog(
                    null,
                    "Hoje é Sexta-Feira",
                    "Determinando dia da Semana",
                    1
                );
                break;
            case 7:
                JOptionPane.showMessageDialog(
                    null,
                    "Hoje é Sábado",
                    "Determinando dia da Semana",
                    1
                );
                break;
            default:
                JOptionPane.showMessageDialog(
                    null,
                    "Número inválido para o dia da semana!",
                    "Determinando dia da Semana",
                    3
                );  
        }
    }
    
}
