/*
Nesse programa vamos usar o devio 'break' para receber notas
até a entrada de uma nota inválida com -1
 */
package aula13b;
import javax.swing.JOptionPane;
public class Aula13b {

    public static void main(String[] args) {
        double nota;
        double somaNotas = 0;
        double media = 0;
        int numeroNotas = 0;
        
        while (true) {
            String notaStr = JOptionPane.showInputDialog(null,
                "Digite a nota do aluno ou -1 para encerrar: ",
                "Escola Senai", 3);
            nota = Double.parseDouble(notaStr);
            if (nota < 0){
                break;
            }
            somaNotas += nota;
            numeroNotas++;
        }
        media = somaNotas / numeroNotas;
        String msg;
        if (media >= 7){
            msg = "Aluno APROVADO com a média " 
                    + String.format("%.1f", media);
        } else if (media >=3 && media < 7) {
            msg = "Aluno de RECUPERAÇÃO com a média " 
                    + String.format("%.1f", media);
        } else {
            msg = "Aluno REPROVADO com a média " 
                    + String.format("%.1f", media);
        }
        JOptionPane.showMessageDialog(null, msg , "Escola Senai", 1);
    }
    
}
