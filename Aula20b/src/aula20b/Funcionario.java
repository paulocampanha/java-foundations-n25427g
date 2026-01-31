/* Nesse classe vamos definir os atributos e métodos
   genéricos de todos os funcionário
*/
package aula20b;

import javax.swing.JOptionPane;

public class Funcionario {
    
    String nome;
    String cargo;
    double salario;
    
    // Construtor do objeto
    public Funcionario(String nome, String cargo, 
            double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        JOptionPane.showMessageDialog(null,
            "Funcionário: " + this.nome 
            + " cadastrado com sucesso");
    }
    
    public void exibirDetalhes(){
        String msg = "Nome: " + this.nome;
        msg += "\nCargo: " + this.cargo;
        msg += "\nSalário: R$ " 
                + String.format("%.2f", this.salario);
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public void tarefa(String descricaoTarefa){
        JOptionPane.showMessageDialog(null,
            this.nome + " recebeu a tarefa: " + descricaoTarefa);
    }
}
