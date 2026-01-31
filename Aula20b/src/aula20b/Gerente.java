/* Nessa classe vamos implementar os atributos e métodos herdados
   da classe Funcionário e implementar seu atributos e métodos
   específicos
 */
package aula20b;

import javax.swing.JOptionPane;

public class Gerente extends Funcionario {
    
    String departamento;
    
    public Gerente(String nome, String cargo, double salario, 
            String departamento){
        super(nome, cargo, salario);
        this.departamento = departamento;
        
    }
    
    public void gerenciarEquipe(){
        JOptionPane.showMessageDialog(null, 
            this.nome + " está gerenciando o departamento de "
            + this.departamento);
    }
    
    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        JOptionPane.showMessageDialog(null, 
            "Está gerenciando o departamento de " + this.departamento
        );
    }
    
    @Override
    public void tarefa(String descricaoTarefa){
        JOptionPane.showMessageDialog(null,
            this.nome + " recebeu a tarefa " + descricaoTarefa);
    }
    
    
}
