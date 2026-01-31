package exercicio20a;

import javax.swing.JOptionPane;

public class Pessoa {

    String nome;
    String cpf;

    // Construtor
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
                
    }

    public void apresentar() {
        JOptionPane.showMessageDialog(null,
            "Olá, meu nome é " + this.nome + 
            " e meu CPF é " + this.cpf + ".");
        
    }
}
