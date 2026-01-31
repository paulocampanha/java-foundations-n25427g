/*  Nessa vclasse vamos herdar e implementar os métodos da classe Funcionario 
 */
package aula24c;

public class Gerente extends Funcionario {
    
    private double bonus;
    
    public Gerente(String nome, double salarioBase, double bonus){
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalarioTotal(){
        double salarioTotal = salarioBase + bonus;
        return salarioTotal;
    }
    
    
    
}
