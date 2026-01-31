/*
Nesse programa vamos estudar o uso de 
operadores lógicos
 */
package aula7b;

import javax.swing.JOptionPane;

public class Aula7b {

    public static void main(String[] args) {
        double saldo = 1000;
        double limite = 5000;
        int anosCliente = 20;
        boolean ehAssinante = false;
        String cidade = "Rio de Janeiro";
        
        if (anosCliente >= 10 && ehAssinante){
            JOptionPane.showMessageDialog(
                null,
                "Clente com desconto de 10%",
                "Lojas B&B",
                1
            );
        }
        
        double saque = 2500;
        
        if (saldo >= saque || saque < limite){
            JOptionPane.showMessageDialog(
                null,
                "Saque realizado com sucesso",
                "Banco Juntos",
                1
            );
        }
                
        
                
    }
    
}
