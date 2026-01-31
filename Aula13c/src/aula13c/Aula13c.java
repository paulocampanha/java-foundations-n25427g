/*
Nesse programa vamos estudar o desvio break com a estrutura
for criando um loop para somar varios números.
 */
package aula13c;
import javax.swing.JOptionPane;

public class Aula13c {

    public static void main(String[] args) {
        
        int soma = 0;
        
        for (;;){    // (;;) usado para o loop infinito no for
            String numero = JOptionPane.showInputDialog(
                null,
                "Digite um número inteiro ou 0 para encerrar",
                "Somar números", 3);
            if (numero.equals("0")){
                break;
            }
            soma += Integer.parseInt(numero);
        }
        JOptionPane.showMessageDialog(null,
            "Resultado da soma: " + soma,
            "Somar números", 1);
    }
    
}
