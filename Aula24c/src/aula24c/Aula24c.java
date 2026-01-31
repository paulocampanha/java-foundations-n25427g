/*
 */
package aula24c;

import javax.swing.JOptionPane;

public class Aula24c {

    public static void main(String[] args) {
        
        Funcionario gerente1 = new Gerente("Gaspar", 10000, 2000);
        gerente1.exibirInformacoes();
        JOptionPane.showMessageDialog(null, 
            "Salario Total: R$ " + gerente1.calcularSalarioTotal());
        
        
    }
    
}
