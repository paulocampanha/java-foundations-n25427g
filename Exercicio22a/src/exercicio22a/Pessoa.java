/* Exercício de POO: Encapsulamento e Saúde (Cálculo de IMC)
Desenvolver uma aplicação em Java que utilize os conceitos de atributos privados, métodos de acesso (getters/setters) e regras de validação para gerenciar dados de uma pessoa e calcular seu Índice de Massa Corporal (IMC).
Crie uma classe chamada Pessoa que possua os seguintes atributos privados:
 String nome
 int idade
 String sexo (M/F)
 double altura (em metros)
 double peso (em quilogramas)
---------------------------------------------
 Regras de Implementação:	
1. Encapsulamento Estrito: Todos os atributos devem ser private.
2. Validação nos Setters: Implemente métodos public (getters e setters) seguindo as seguintes restrições:
   Numéricos (idade, peso, altura): O sistema não deve aceitar valores menores ou iguais a zero. Caso um valor inválido seja enviado, exiba uma mensagem de erro ou mantenha o valor anterior.
   Texto (nome): Não deve aceitar valores nulos ou strings vazias/em branco.
3. Construtor Estruturado: Crie um construtor que receba todos os parâmetros. 
   Atenção: O construtor não deve atribuir os valores diretamente aos atributos (ex: this.peso = peso). Ele deve, obrigatoriamente, chamar os métodos setters correspondentes para garantir que as validações sejam executadas já na instanciação (ex: this.setIdade(idade)).
4. Cálculo de IMC: Crie um método público chamado calcularIMC() que utilize a fórmula abaixo e exiba no console ou JOptionPane o valor do IMC e a classificação correspondente do indivíduo.
-----------------------------------------------
 Guia de Referência Técnica
 1. Fórmula do Cálculo
    O IMC é calculado dividindo o peso pela altura elevada ao quadrado:
	imc = peso / altura²
 2. Tabela de Classificação (OMS)
Utilize a tabela abaixo para implementar a lógica de classificação no seu método:
 IMC                           Classificação 
 Abaixo de 18.5                Abaixo do peso 
 18.5 – 24.9                   Peso normal 
 25.0 – 29.9                   Sobrepeso 
 30.0 – 34.9                   Obesidade Grau I 
 35.0 – 39.9                   Obesidade Grau II 
 Maior ou igual a 40.0         Obesidade Grau III (Mórbida) 
 3. Método main
    Na sua classe principal (Exercicio22a), utilize a classe Scanner ou JOptionPane para permitir que o usuário digite os dados. Tente instanciar pelo menos dois objetos de Pessoa para testar as validações (ex: tente inserir uma idade negativa e veja se o seu código impede a alteração).
 */
package exercicio22a;

import javax.swing.JOptionPane;

public class Pessoa {
    // Atributos privados
    private String nome;
    private int idade;
    private String sexo;
    private double altura;
    private double peso;

    // Construtor
    public Pessoa(String nome, int idade, String sexo, 
            double altura, double peso) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setAltura(altura);
        this.setPeso(peso);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(null, 
                "Erro: O nome não pode estar vazio.", 
                "Erro de Validação", JOptionPane.ERROR_MESSAGE);
        }
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            JOptionPane.showMessageDialog(null, 
                "Erro: A idade deve ser maior que zero.", 
                "Erro de Validação", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            JOptionPane.showMessageDialog(null, 
                "Erro: A altura deve ser maior que zero.", 
                "Erro de Validação", JOptionPane.ERROR_MESSAGE);
        }
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            JOptionPane.showMessageDialog(null, 
                "Erro: O peso deve ser maior que zero.", 
                "Erro de Validação", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método de Cálculo e Exibição do IMC
    public void calcularIMC() {
        
        double imc = this.peso / (this.altura * this.altura);
        String classificacao;

        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            classificacao = "Peso normal";
        } else if (imc >= 25.0 && imc <= 29.9) {
            classificacao = "Sobrepeso";
        } else if (imc >= 30.0 && imc <= 34.9) {
            classificacao = "Obesidade Grau I";
        } else if (imc >= 35.0 && imc <= 39.9) {
            classificacao = "Obesidade Grau II";
        } else {
            classificacao = "Obesidade Grau III (Mórbida)";
        }

        // Montando a mensagem final formatada
        String mensagem = String.format(
            "RESULTADO DO IMC\n\n" +
            "Paciente: %s\n" +
            "Idade: %d anos\n" +
            "IMC Calculado: %.2f\n" +
            "Classificação: %s",
            this.nome, this.idade, imc, classificacao
        );

        JOptionPane.showMessageDialog(null, mensagem, "Relatório de Saúde", JOptionPane.INFORMATION_MESSAGE);
    }
}