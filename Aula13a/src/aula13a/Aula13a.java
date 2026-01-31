/*
Nesse programa vamos imprimir os números
entre 1 e 40, exceto os multiplos de 3. 
Para essa rotina, vamos usar o desvio 'continue'
 */
package aula13a;

public class Aula13a {
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 40){
            contador++;
            if (contador % 3 == 0){
                continue;
            }
            System.out.print(contador + ", ");
        }
    }
    
}
