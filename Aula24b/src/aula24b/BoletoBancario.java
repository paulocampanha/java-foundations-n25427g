/* Nessa classe vamos herdar os métodos e atributos da classe FormaPagamento e
   implementar seu mnétodos abstratos
 */
package aula24b;

import javax.swing.JOptionPane;

public class BoletoBancario extends FormaPagamento {
    
    @Override
    public void processarPagamento(){
        JOptionPane.showMessageDialog(null, 
            "Gerando boleto bancário para pagamento");
    }
    
}
