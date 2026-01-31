/* Nesse classe vamos definir os atributos como privados para aplicar
   o paradigma do encapsulamento em Java
 */
package aula22a;

import javax.swing.JOptionPane;

public class Produto {
    
    private String nomeProduto;
    private double preco;
    private int quantidade;
    private String embalagem;
    
    // Métodos setters para definir o conteúdo dos atributos
    public void setNomeProduto(String nome){
        this.nomeProduto = nome;
    }
    
    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }
    
    public void setPreco(double preco){
        if (preco >= 0) {
            this.preco = preco;
        } else {
            JOptionPane.showMessageDialog(null, 
                "O preço do produto não pode ser negativo");
        }
    }
    
    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            JOptionPane.showMessageDialog(null,
                "A quantidade não pode ser negativa");
        }
    }
    
    public void exibirDetalhes(){
        String msg = "Produto: " + this.nomeProduto;
        msg += "\nEmbalagem: " + this.embalagem;
        msg += "\nQuantidade: " + this.quantidade;
        msg += "\nPreço: R$ " + String.format("%.2f", this.preco);
        JOptionPane.showMessageDialog(null, msg);
    }
    
    // Métodos getters para obter o valor dos atributos privados
    public String getNomeProduto(){
        return this.nomeProduto;
    }
    
    public String getEmbalagem(){
        return this.embalagem;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public Produto(String nomeProduto, double preco, int quantidade, 
            String embalagem){
        this.setNomeProduto(nomeProduto);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
        this.setEmbalagem(embalagem);
    }
    
    
}
