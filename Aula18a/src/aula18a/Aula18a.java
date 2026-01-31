/* Nesse programa vamos estudar metodos com argumetos e sem retorno
 */
package aula18a;

import javax.swing.JOptionPane;

public class Aula18a {

    // Método com parâmetro e sem retorno
    public static void calcularExibirMedia(
            double n1, double n2, double n3, double n4){
        double media = (n1 + n2 + n3 + n4) / 4;
        JOptionPane.showMessageDialog(null,
            "A média do aluno foi " + String.format("%.2f", media) ,
            "Calcular Média", 1);
    }
    
    // Método com parâmentro e com retorno
    public static double digitarNota(int x){
        String notaStr = JOptionPane.showInputDialog(null,
            "Digite a " + x + "ª nota do aluno: ", "Calcular Média", 1);
        notaStr = notaStr.replace(",", ".");
        double nota = Double.parseDouble(notaStr);
        return nota;
    }
    
    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4;
        nota1 = digitarNota(1);
        nota2 = digitarNota(2);
        nota3 = digitarNota(3);
        nota4 = digitarNota(4);
        
        calcularExibirMedia(nota1, nota2, nota3,nota4);
        
    }
    
}
