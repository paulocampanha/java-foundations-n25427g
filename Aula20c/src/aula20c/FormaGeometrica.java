/* Nessa classe vamos definir os atributos e métodos 
   genéricos
 */
package aula20c;

import javax.swing.JOptionPane;

public class FormaGeometrica {
    String cor;
    
    // Construtor
    public FormaGeometrica(String cor){
        this.cor = cor;
    }
    
    // Métodos genéricos
    public void desenhar(){
        JOptionPane.showMessageDialog(null, 
            "Forma geométrica da cor " + this.cor +
            " criada com sucesso");
    }
    
    public void exibirDetalhes(){
        String msg = "Cor da Figura: " + this.cor;
        JOptionPane.showMessageDialog(null, msg);
    }
}
