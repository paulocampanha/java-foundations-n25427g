/*
 */
package aula22b;

public class Aula22b {

    public static void main(String[] args) {
        
        ContaBancaria cliente1 = new ContaBancaria("Gaspar Souza", "123.456.789-10");
        
        cliente1.exibirSaldo();
        cliente1.depositar(5000.00);
        cliente1.exibirSaldo();
        cliente1.sacar(2500.00);
        cliente1.exibirSaldo();
        cliente1.depositar(0);
        cliente1.sacar(5000.00);
        cliente1.exibirSaldo();
        
        

        
    }
    
}
