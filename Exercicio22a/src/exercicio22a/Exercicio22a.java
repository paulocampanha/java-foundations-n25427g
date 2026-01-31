/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio22a;

import javax.swing.JOptionPane;

public class Exercicio22a {
    public static void main(String[] args) {
        
        
        // --- Entrada de Dados ---
        String nome = JOptionPane.showInputDialog(null, "Digite o nome da pessoa:", "Cadastro", JOptionPane.QUESTION_MESSAGE);

        String idadeStr = JOptionPane.showInputDialog(null, "Digite a idade:", "Cadastro", JOptionPane.QUESTION_MESSAGE);
        int idade = Integer.parseInt(idadeStr); // Converte texto para inteiro

        String sexo = JOptionPane.showInputDialog(null, "Digite o sexo (M/F):", "Cadastro", JOptionPane.QUESTION_MESSAGE);

        // Dica: replace substitui virgula por ponto caso o usuário digite "1,75"
        String alturaStr = JOptionPane.showInputDialog(null, "Digite a altura em metros (ex: 1.75):", "Cadastro", JOptionPane.QUESTION_MESSAGE);
        double altura = Double.parseDouble(alturaStr.replace(",", ".")); 

        String pesoStr = JOptionPane.showInputDialog(null, "Digite o peso em KG (ex: 70.5):", "Cadastro", JOptionPane.QUESTION_MESSAGE);
        double peso = Double.parseDouble(pesoStr.replace(",", "."));

        // --- Instanciação do Objeto ---
        // O construtor Pessoa pessoa = new Pessoa(nome, idade, sexo, altura, peso);chamará os setters e validará os dados, exibindo erro se houver.
        Pessoa pessoa = new Pessoa(nome, idade, sexo, altura, peso);
        Pessoa pessoa2 = new Pessoa("Gaspar", 18, "Masculino", 1.75, 79);

        // --- Cálculo e Exibição ---
        pessoa.calcularIMC();
        pessoa2.calcularIMC();

        
    }
}