/*
 * Nesse programa vamos reeber alguns dados utilizando o JOptionPane
 * gerear e imprimir um relatório no console e em uma caixa de dialogo
 * do tipo JOptionPane
 */
package aula5d;
import javax.swing.JOptionPane;

public class Aula5d {

    public static void main(String[] args) {
        String titulo = "Sistema Senai";
        String nome = JOptionPane.showInputDialog(
                null,
                "Digite seu nome:",
                titulo, 3);
        String idade = JOptionPane.showInputDialog(
                null,
                "Digite sua idade:",
                titulo, 3);
        String altura = JOptionPane.showInputDialog(
                null,
                "Digite sua altura: ",
                titulo, 3);
        
        double idadeEmAnosLuz = 
                Double.parseDouble(idade) * Double.parseDouble(altura);
        
        String msg = "Relatorio de Dados\n\n";
        msg = msg + "Nome: " + nome + "\n";
        msg = msg + "Idade: " + idade + "\n";
        msg = msg + "Altura: " + altura + "\n";
        msg = msg + "Cálculo Simples (idade * altura): " + 
                idadeEmAnosLuz;
        JOptionPane.showMessageDialog(
                null,
                msg,
                titulo, 1);

    }
    
}
