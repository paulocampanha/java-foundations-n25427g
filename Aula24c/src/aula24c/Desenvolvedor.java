/*
 */
package aula24c;

public class Desenvolvedor extends Funcionario{
    
    private double horasExtras;
    
    public Desenvolvedor(String nome, double salarioBase, double horasExtras){
        super(nome, salarioBase);
        this.horasExtras = horasExtras;
    }
    
    @Override
    public double calcularSalarioTotal(){
        double salarioTotal = salarioBase + (horasExtras * 50);
        return salarioTotal;
    }
}
