/*  Nessa classe vamos definir os métodos que devem ser implementados
    pelas subclasse e vamos implementar os próprios métodos e atributos
    dessa classe.
 */
package aula24c;

import javax.swing.JOptionPane;

public abstract class Funcionario {
    
    protected String nome;
    protected double salarioBase;
    
    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    
    //Método concreto
    public void exibirInformacoes(){
        String msg = "Nome: " + this.nome;
        msg += "\nSalário Base: R$ " + this.salarioBase;
        JOptionPane.showMessageDialog(null, msg);
    }
    
    //Método abstrato
    public abstract double calcularSalarioTotal();
}
