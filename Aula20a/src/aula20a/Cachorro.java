/* Essa classe vai herdar os atributos e métodos da classe animal
   e implementar seu próprio atributos e métodos, que são os
   específicos da classe
 */
package aula20a;

import javax.swing.JOptionPane;

public class Cachorro extends Animal {
    
    // Atributos específicos
    String raca;
    String porte;
    
    // Construtor da subclasse
    public Cachorro(String nome, int idade, String raca, 
            String porte){
        super(nome, idade);  // Chama o construtor da superclasse (Animal)
        this.raca = raca;
        this.porte = porte;
    }
    
    // Método específico de Cachorro
    public void latir(){
        JOptionPane.showMessageDialog(null,
            this.nome + " está latindo. AU! AU! AU!");
    }
    
    // Sobrescrita do método exibirDetalhes()
    @Override // Anotação para indicar que o método está sendo sobrescrito
    public void exibirDetalhes(){
        super.exibirDetalhes();
        String msg = "Raça: " + this.raca;
        msg += "\nPorte: " + this.porte;
        JOptionPane.showMessageDialog(null, msg);
    }
}
