/*
Crie um  programa com duas arrays de 5 elementos cada. 
A primeira array deve receber o nome de 5 pessoas e a 
segunda array deve receber a idade dessas 5 pessoas. 
Imprima o nome e a idade de cada pessoa em uma caixa do
tipo JOptionPane.showMessageDialog(), uma pessoa por 
caixa de dialogo. 
Os nomes e as idade serão inseridas no proprio programa. 
Não é necessário usar JOptionPane.showInputDialog() para
inserir os nomes e as idade.
 */
package exercicio14a;
import javax.swing.JOptionPane;

public class Exercicio14a {

    public static void main(String[] args) {
        String[] nomes = new String[5];                
        nomes[0] = "Gaspar";
        nomes[1] = "Luiza";
        nomes[2] = "Jorge";
        nomes[3] = "Anabela";
        nomes[4] = "Bruce";
        
        int[] idades = {18, 25, 32, 16, 12};
                
        for (int i = 0; i < nomes.length; i++){
            JOptionPane.showMessageDialog(
                null,
                nomes[i] + " tem " + idades[i] + " anos.",
                "Exercicio e Array",
                1);
        }
        
        JOptionPane.showMessageDialog(
            null,
            "Fim do Programa. ",
            "Exercicio e Array",
            1);
    }
    
}
