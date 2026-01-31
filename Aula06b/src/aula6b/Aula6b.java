/*
 * Nesse programa vamos estudar os operadores de 
 * Atribuição Composta em java 
 */
package aula6b;

public class Aula6b {
    public static void main(String[] args) {
        // Operadores +, -, *, / %
        int num = 50;
        System.out.println("Valor de num: " + num);
        // Operadores compostos: +=, -+, *=, /=, %=
        num += 5;  // equivalente a num = num + 5
        System.out.println(
                "Valor de num acrescido de 5: " + num);
        num -= 10;  // equivalente a num = num - 10
        System.out.println(
                "Valor de num subtraido de 10: " + num);
        num *= 2; // equivalente a num = num * 2
        System.out.println(
                "Valor de num multiplicado com 2: " + num);
        num /= 4;  // equivalente a num = num / 4
        System.out.println(
                "Valor de num dividido por 4: " + num);
        num %= 4;  // equivalente a num = num % 4
        System.out.println(
                "Valor de num modulo de 4: " + num);
        
        // Operadores de incremento e decremento
        int x = 5;
        x++;  // incremento
        System.out.println("Valor de x++: " + x);
        x--;
        System.out.println("Valor de x--: " + x);
        
        int y = x++;
        System.out.println("Valor de y: " + y);
        System.out.println("Valor de x: " + x);
        
        y = ++x;
        System.out.println("Valor de y: " + y);
        System.out.println("Valor de x: " + x);
        
        
    }
    
}
