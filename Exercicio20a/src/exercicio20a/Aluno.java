package exercicio20a;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa {
    String matricula;
    String curso;
    
    public Aluno(String nome, String cpf, String matricula, String curso) {
        super(nome, cpf); // Chama o construtor de Pessoa
        this.matricula = matricula;
        this.curso = curso;
        
    }
    
    public void estudar() {
        JOptionPane.showMessageDialog(null, 
            this.nome + " está estudando " + this.curso + ".");
        
    }
    
    @Override
    public void apresentar() {
        //super.apresentar(); // Chama o método da superclasse
        JOptionPane.showMessageDialog(null,
            "Olá, meu nome é " + this.nome + 
            " e meu CPF é " + this.cpf + "." +
            "\nMinha matrícula é " + this.matricula + 
            " e sou do curso de " + this.curso + ".");
        
    }
}  

