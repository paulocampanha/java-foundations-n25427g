package exercicio20a;

public class Exercicio20a {

    public static void main(String[] args) {
        System.out.println("--- Criando Pessoas, Alunos e Professores ---");
        Pessoa pessoaGenerica = new Pessoa("Maria", "111.111.111-11");
        pessoaGenerica.apresentar();
        
        System.out.println("--------------------");
        Aluno novoAluno = new Aluno("Pedro", "222.222.222-22", "2023001", "Engenharia");
        novoAluno.apresentar(); // Método sobrescrito
        novoAluno.estudar(); // Método específico de Aluno
        System.out.println("--------------------");
        
    }
    
    
}
