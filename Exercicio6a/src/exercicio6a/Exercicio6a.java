/*
Crie um programa em Java que:
1.  Utilize a classe JOptionPane para:
       Solicitar ao usuário o nome.
       Solicitar ao usuário o ano de nascimento.
2.  Crie uma variável para armazenar o ano atual (por exemplo, 2025).
3.  Calcule a idade aproximada da pessoa (considerando que ela já fez aniversário no ano atual).
4.  Exiba uma mensagem usando JOptionPane no seguinte formato:
        Fulano, você tem XX anos se já tiver feito aniversário este ano.
Dicas:
   Use Integer.parseInt() para converter o ano de nascimento informado (String) em número inteiro.
   Utilize JOptionPane.showInputDialog() para receber os dados e JOptionPane.showMessageDialog() para exibir a mensagem.
 */

package exercicio6a;
import javax.swing.JOptionPane;
public class Exercicio6a {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(
                null,
                "Digite seu nome",
                "Calculadora de Idade",
                3
        );
        String anoNascString = JOptionPane.showInputDialog(
                null,
                "Digite o ano do seu nascimento",
                "Calculadora de Idade",
                3
        );
        int anoNasc = Integer.parseInt(anoNascString);  
        int anoAtual = 2025;
        int idade = anoAtual - anoNasc;
        JOptionPane.showMessageDialog(
                null,
                nome + ", você tem " + idade + 
                " anos se já tiver feito aniversário este ano.",
                "Calculadora de Idade",
                1
        );
        
    }
    
}
