/*

 */
package aula13d;
import javax.swing.JOptionPane;
public class Aula13d {

    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog(
            null,
            "Digite uma frase para contegem de letras: ",
            "Contador de letras", 3);
        int totalLetras = 0;
        for (int i = 0; i < frase.length(); i++){
            if (frase.charAt(i) == ' '){
                continue;
            }
            totalLetras++;
        }
        JOptionPane.showMessageDialog(
            null,
            "A frase possui " + totalLetras + " letras.",
            "Contador de letras", 1);
    }    
}
