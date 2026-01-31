/*
Nesse programa vamos estudar o uso de Array Unidimensional
 */
package aula14a;

public class Aula14a {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        
        numeros[0] = 13;
        numeros[1] = 14;
        numeros[2] = 29;
        numeros[3] = 30;
        numeros[4] = 19;
        
        String[] frutas = {"Maca", "Pera", "Banana", "Laranja"};
        
        // Imprimindo todos os alementos de uma array
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Numero na posicao " + i + ": " + numeros[i]);
        }
        
        // Acessando o primeiro elemento
        System.out.println("Fruta: " + frutas[0]);
        
        //Alterando o valor do terceiro elemento
        String bkpFruta = frutas[2];
        frutas[2] = "Morango";
        
        //Acessando o tamanho de array
        System.out.println("O array de frutas tem " 
                + frutas.length + " elementos.");
        
        // Imprimindo todos os elementos de um array usando for-each
        for (String fruta : frutas){
            System.out.println("Fruta: " + fruta);
        }
        
                
        
     }
    
}
