/* Nessa classe vamos usar o encapsulamento para proteger os atributos da 
   classe
 */
package aula22b;

import javax.swing.JOptionPane;

public class ContaBancaria {
    
    private String nomeCliente;
    private String cpf;
    private double saldo = 0;

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        if (nomeCliente != null && !nomeCliente.trim().isEmpty()) {
            this.nomeCliente = nomeCliente.trim();
        } else {
            JOptionPane.showMessageDialog(null, 
                "O nome do cliente não pode ser vazio.");
        }
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    public ContaBancaria(String nomeCliente, String cpf) {
        this.setNomeCliente(nomeCliente);
        this.setCpf(cpf);        
    }
    
    public void depositar(double valor){
        if (valor > 0) {
            this.saldo += valor;
        } else {
            JOptionPane.showMessageDialog(null, 
                "Não é permitido deposito 0 ou negativo.");
        }
    }
    
    public void sacar(double valor){
        if (valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
        } else {
            if (valor < 0) {
                JOptionPane.showMessageDialog(null, 
                    "O saque não pode ser 0 ou negativo");
            } else {
                JOptionPane.showMessageDialog(null, 
                    "Saldo insuficiente para o saque");
            }
        }
    }
    
    public void exibirSaldo(){
        JOptionPane.showMessageDialog(null, 
            "Saldo atual: " + String.format("%.2f", this.getSaldo()));
    }
    
    
    
}
