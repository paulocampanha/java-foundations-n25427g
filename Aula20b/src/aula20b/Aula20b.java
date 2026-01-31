/* Nessa lcasse vamos implementar os objetos dos tipos Funcionário,]
   Gerente e Programador
 */
package aula20b;
import javax.swing.JOptionPane;

public class Aula20b {

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog(null,
            "Digite o nome do funcionário:").toUpperCase();
        String cargo = JOptionPane.showInputDialog(null,
            "Digite o corgo do funcionário:");
        String salarioStr = JOptionPane.showInputDialog(null,
            "Digite o salario do funcionario: ");
        salarioStr = salarioStr.replace(",", ".");
        double salario = Double.parseDouble(salarioStr);
        String descricao = JOptionPane.showInputDialog(null,
            "Digite a tarefa do funcionário:");
        
        
        Funcionario func1 = new Funcionario(nome, cargo, salario);
        func1.exibirDetalhes();
        func1.tarefa(descricao);
        
        nome = JOptionPane.showInputDialog(null,
                "Digite o nome do Gerente: ");
        cargo = "Gerente";
        salarioStr = JOptionPane.showInputDialog(null,
                "Digite o salario do gerente: ");
        salarioStr = salarioStr.replace(",", ".");
        salario = Double.parseDouble(salarioStr);
        String departamento = JOptionPane.showInputDialog(null,
                "Digite o nome do departamento do gerente: ");
        descricao = JOptionPane.showInputDialog(null,
                "Digite a tarefa do gerente: ");
        Gerente ger1 = new Gerente(nome, cargo, salario, departamento);
        
        ger1.exibirDetalhes();
        ger1.gerenciarEquipe();
        ger1.tarefa(descricao);
        
                
        
    }
    
}
