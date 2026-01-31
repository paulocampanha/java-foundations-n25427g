/*
Nesse programa vamos usar a estrutura 'for' para calcular
a média das notas de um aluno. O número de notas não será 
fixo e o professor devera informar quantas notas deseja 
lançar
 */
package aula11e;
import javax.swing.JOptionPane;

public class Aula11e {

    public static void main(String[] args) {
        
        String quantidadeNotas = JOptionPane.showInputDialog(
            null, 
            "Digite o número de notas que será lançado:",
            "Escola SESI", 1);
        int notas = Integer.parseInt(quantidadeNotas);
        double media;
        double soma = 0;
        
        for (int i = 1; i <= notas; i++){
            String nota = JOptionPane.showInputDialog(
                null, "Digite a nota do aluno: ",
                "Escola SESI", 3);
            nota = nota.replace(",", ".");
            soma += Double.parseDouble(nota);  // soma = soma + nota
        }
        
        media = soma / notas;
        String mediaF = String.format("%.1f", media);
        if (media >= 6){
            JOptionPane.showMessageDialog(null,
                "O aluno foi APROVADO com a média " + mediaF,
                "Escola SESI", 1);
        }else if (media >=3 && media < 6){
            JOptionPane.showMessageDialog(null,
                "O aluno ficou de RECUPERAÇÃO com a média " + mediaF,
                "Escola SESI", 1);
        } else {
            JOptionPane.showMessageDialog(null,
                "O aluno foi REPROVADO com a média " + mediaF,
                "Escola SESI", 1);
        }
                
    }
    
}
