/*
Nesse programa vamos solicitar ao usuário para digitar os as notas de
um aluno e calcular a média desse aluno.
 */
package aula14b;
import javax.swing.JOptionPane;

public class Aula14b {

    public static void main(String[] args) {
        String titulo = "Escola Senai";
        String totalNotasStr = JOptionPane.showInputDialog(
            null,
            "Quantas notas deseja lançar: ",
            titulo, 3);
        int totalNotas = Integer.parseInt(totalNotasStr);
        double[] notas = new double[totalNotas];
        double somaNotas = 0;
        for (int i = 0; i < notas.length; i++){
            String nota = JOptionPane.showInputDialog(
                null,
                "Digite a nota " + (i+1),
                titulo, 3);
            nota = nota.replace(",", ".");
            notas[i] = Double.parseDouble(nota);
        }
        String msg = "";
        for (int i = 0; i < notas.length; i++){
            if (i < notas.length - 1){
                msg += String.format("%.1f",notas[i]) + ", ";
            } else {
                msg += String.format("%.1f",notas[i]);
            }
        }
        JOptionPane.showMessageDialog(
            null, "Notas digitas: " + msg, titulo, 1);
        for (Double nota : notas){
            somaNotas += nota;
        }
        double media = somaNotas / notas.length;
        JOptionPane.showMessageDialog(
            null,
            "A média do aluno é " + String.format("%.1f", media),
            titulo, 1);
    }
    
}
