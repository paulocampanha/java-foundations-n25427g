/* Nessa classe vamos tstar o encapsulamentos de atributos na orientação
   a objetos
 */
package aula22a;

import javax.swing.JOptionPane;

public class Aula22a {

    public static void main(String[] args) {
        
        Produto prod1 = new Produto("Biscoito Passatempo", 4.99, 10, "Pacote");
        
               
        //prod1.exibirDetalhes();
        
        String msg = "Produto: " + prod1.getNomeProduto();
        msg += "\nEmbalagem: " + prod1.getEmbalagem();
        msg += "\nPreço: R$ " + String.format("%.2f", prod1.getPreco());
        msg += "\nQuantidade: " + prod1.getQuantidade();
        
        JOptionPane.showMessageDialog(null, msg);
        
    }
    
}
