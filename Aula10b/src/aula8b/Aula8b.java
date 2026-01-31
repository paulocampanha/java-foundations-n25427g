/*
 Nesse programa vamos verificar se linguagem de programação informada
 corresponde ao Java.
 */
package aula8b;
import javax.swing.JOptionPane;
public class Aula8b {

    public static void main(String[] args) {
        String linguagem = JOptionPane.showInputDialog(
            null,
            "Digite a linguagem de programação que você domina",
            "Verifcar domínio do candidato",
            2
        );
        if (linguagem.equalsIgnoreCase("java")){
            JOptionPane.showMessageDialog(null,
                "Você está apto para a vaga de programador",
                "Verifcar domínio do candidato",
                2
            );
        } else {
            JOptionPane.showMessageDialog(null,
                "Você não está apto para a vaga de programador",
                "Verifcar domínio do candidato",
                2
            );
        }
        
    }
    
}
