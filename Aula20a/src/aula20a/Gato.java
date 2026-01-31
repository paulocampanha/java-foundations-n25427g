/* Essa classe vai herdar os atributos e métodos da classe animal
   e implementar seu próprio atributos e métodos, que são os
   específicos da classe
*/
package aula20a;

import javax.swing.JOptionPane;

public class Gato extends Animal {
    
    //Atributo específico de Gato
    String tipoPelo;
    String corPelo;
    
    // Construtor da subclasse
    public Gato(String nome, int idade, String tipoPelo, 
            String corPelo) {
        super(nome, idade); // Chama o construtor da superclasse (Animal)
        this.tipoPelo = tipoPelo;
        this.corPelo = corPelo;
    }
    
    // Méodo específico do Gato
    public void miar(){
        JOptionPane.showMessageDialog(null, 
            this.nome + " está miando. MIAU! MIAU! MIAU!");
    }
    
    // Sobrescrever o método exibirDetalhes()
    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        String msg = "Tipo de pelo: " + this.tipoPelo;
        msg += "\nCor do pelo: " + this.corPelo;
        JOptionPane.showMessageDialog(null, msg);
    }
    
}   

