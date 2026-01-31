/* Nessa classe vamos implentar as assinaturas do métodos abstratos
 */
package aula24b;

import javax.swing.JOptionPane;

public abstract class FormaPagamento {
    
    //Método abstrato: subclasses devem implementar
    public abstract void processarPagamento();
    
    //Método concreto: implementado na classe abstrata, compartilhado 
    //pelas subclasses
    public void exibirConfirmacao() {
        JOptionPane.showMessageDialog(null, 
            "Pagamento processado com sucesso.");
    }
    
    
}
