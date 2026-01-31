/*
Nesse programa vamos continuar estudando switch-case
 */
package aula9b;
import javax.swing.JOptionPane;

public class Aula9b {

    public static void main(String[] args) {
        String nota = JOptionPane.showInputDialog(
            null,
            "Digite a nota do aluno: \n(A, B, C, D, E)",
            "Escola Celso Charuri",
            0
        );
        nota = nota.toUpperCase();
        switch (nota){
            case "A":
            case "B":
            case "C":
                JOptionPane.showMessageDialog(
                    null,
                    "Aluno Aprovado",
                    "Escola Celso Charuri",
                    1
                );
                break;
            case "D":
                JOptionPane.showMessageDialog(
                    null,
                    "Aluno de Recuperação",
                    "Escola Celso Charuri",
                    1
                );
                break;
            case "E":
                JOptionPane.showMessageDialog(
                    null,
                    "Aluno Reprovado",
                    "Escola Celso Charuri",
                    1
                );
                break;
            default:
                JOptionPane.showMessageDialog(
                    null,
                    "Nota Inválida",
                    "Escola Celso Charuri",
                    1
                );
        }
    }
    
}
