/*
 * Nesse programa vamos estudar as estrutura de
 * desvio condicional 'if'.
 */
package aula7a;

import javax.swing.JOptionPane;

public class Aula7a {
    
    public static void main(String[] args) {
        int idade = 20;
        double saldo = 150.75;
        String usuario = "admin";
        boolean ehAluno = true;
        
        if (idade >= 18){
            JOptionPane.showMessageDialog(
                null,
                "Você é maior de idade.",
                "Verificador de Idades",
                1    
            );
        }
        
        double saque = 250.00;
        if (saldo < saque){
            JOptionPane.showMessageDialog(
                null,
                "Saldo insuficiente para o saque",
                "Verificador de Saldo",
                0
            );
        }
        
        if (usuario.equals("admin")){
            JOptionPane.showMessageDialog(
                null,
                "Acesso Administrador concedido",
                "Verificação de Usuário",
                1
            );
        }
        
        if (ehAluno) {
            JOptionPane.showMessageDialog(
                null,
                "Aluno do Senai Celso Charuri",
                "Verificador de Alunos",
                1
            );
        }
        
        int resposta = 
            JOptionPane.showConfirmDialog(
                null,
                "Deseja continuar no curso de Java?",
                "Verificador de Curso",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(
                null,
                "Então vamos continuar com o curso",
                "Verificador de Curso",
                1
            );
        }
    }
}
