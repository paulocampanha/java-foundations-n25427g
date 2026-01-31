/*
Você foi convidade para elaborar um programa para o banco de
sangue de um hospital. Nesse programa você precisa dar entrada
no nome do doador e na sua idade. Para doar sangue, uma pessoa
precisa ter entre 18 e 65 anos. Faça um loop que recebe o nome
e a idade do doador e, se a idade não estiver dentro do limete
solicite novamente o nome e a idade. 
No final, exiba uma caixa enviado o doador para a sala de triagem

 */
package exercicio11a;

import javax.swing.JOptionPane;

public class Exercicio11a {

    public static void main(String[] args) {
        int idade;
        String nome;
        
        do {
            nome = JOptionPane.showInputDialog(
                null,"Digite o nome do doador",
                "Hospital Nacional", 3);
            String idadeStr = JOptionPane.showInputDialog(
                null,
                "Digite a idade do doador (18 a 65 anos)",
                "Hospital Nacional", 3);
            idade = Integer.parseInt(idadeStr);
        } while (idade < 18 || idade > 65);
        
        JOptionPane.showMessageDialog(
            null, "Dirija-se ao setor de Triagem",
            "Hospital Nacional",1);
    }
    
}
