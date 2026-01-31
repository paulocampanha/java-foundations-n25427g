/* Nessa classe vamos definir os atibutos e metodos dos objetos do
   tipo produto e definir um contrutor para a criação dos objetos 
 */
package aula19b;

import javax.swing.JOptionPane;

public class Produto {
    
    // Atributos
    String nomeProduto;
    int quantidade;
    double preco;
    
    // Construtor
    public Produto(String nome, int qtde, double valor) {
        this.nomeProduto = nome;
        this.quantidade = qtde;
        this.preco = valor;
    }
    
    public void exibirDetalhes(){
        String msg = "Produto: " + this.nomeProduto;
        msg += "\nQuantidade: " + this.quantidade;
        msg += "\nPreço: R$ " + String.format("%.2f", this.preco);
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public double calcularValorEstoque() {
        double valorEstoque = this.quantidade * this.preco;
        return valorEstoque;
    }
    
    public void entradaEstoque(int quantidade) {
        this.quantidade += quantidade;
    }
    
    public Produto(String nome, double valor){
        this.nomeProduto = nome;
        this.preco = valor;
        this.quantidade = 0;
    }
    
    
}
