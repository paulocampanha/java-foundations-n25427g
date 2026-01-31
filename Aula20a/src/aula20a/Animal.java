/* Nessa classe vamos definir os atributos e métodos genéricos
   dos animais
 */
package aula20a;

import javax.swing.JOptionPane;

public class Animal {
    
    String nome;
    int idade;
    
    // Construtor da superclasse
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;        
    }
    
    // Método comum a todos os animais
    public void comer(){
        JOptionPane.showMessageDialog(null,
                this.nome + " está comendo.");
    }
    
    public void exibirDetalhes(){
        String msg = "Nome: " + this.nome;
        msg += "\nIdade: " + this.idade;
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
