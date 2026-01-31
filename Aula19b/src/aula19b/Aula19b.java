/*  Nesse programa vamos implementar os objetos da classe produto
 */
package aula19b;

import javax.swing.JOptionPane;

public class Aula19b {

    public static void main(String[] args) {
        
        Produto produto1 = new Produto("Notebook", 5, 3500.00);
        
        produto1.exibirDetalhes();
        double valorEstoque = produto1.calcularValorEstoque();
        JOptionPane.showMessageDialog(null, 
            "Valor atual do Estoque: R$ " + String.format("%.2f", valorEstoque));
        
        produto1.entradaEstoque(10);
        
        produto1.exibirDetalhes();
        valorEstoque = produto1.calcularValorEstoque();
        JOptionPane.showMessageDialog(null, 
            "Valor atual do Estoque: R$ " + String.format("%.2f", valorEstoque));
        
        Produto produto2 = new Produto("Smartphone", 1200.00);
        
        produto2.exibirDetalhes();
        produto2.entradaEstoque(25);
        produto2.exibirDetalhes();
        
        
        
        
    }
    
}
