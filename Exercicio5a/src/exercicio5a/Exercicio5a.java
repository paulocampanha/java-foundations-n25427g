/*
Crie um programa para simular o controle de estoque de um produto e a conversão de um total de minutos em horas e minutos restantes.
Requisitos:
1. Declare uma variável int chamada estoque e inicialize-a com 250.
2. Use o operador -= para simular uma venda de 45 itens.
3. Use o operador *= para simular um aumento de 10% no estoque (multiplique por 1.1, ou seja, estoque *= 1.1). 
   Lembre-se que o resultado pode precisar ser convertido para int após a multiplicação por um double.
4. Declare uma variável int chamada totalMinutos e inicialize-a com 145.
5. Declare um variável int chamada totalHoras e inicialize convertendo totalMinutos em horas (totalMinutos / 60)
6. Use o operador %= em totalMinutos para encontrar os minutos restantes após a conversão para horas (Ou seja, totalMinutos %= 60).
7. Exiba o estoque final, o totalHoras e os totalMinutos restantes.
 */
package exercicio5a;

public class Exercicio5a {

    public static void main(String[] args) {
        int estoque = 250;
        estoque -=45;   
        estoque *= 1.1; 
        
        int totalMinutos = 145;
        int totalHoras = totalMinutos / 60;
        totalMinutos %= 60;
        
        System.out.println("Estoque final: " + estoque);
        System.out.println("Tempo total: " + totalHoras + 
                " horas e " + totalMinutos + " minutos.");
        
    }
    
}
