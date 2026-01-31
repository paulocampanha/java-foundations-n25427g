/* Polimorfismo por Sobrecarga
 */
package aula21a;

import javax.swing.JOptionPane;

public class Aula21a {

    // Método 1: soma dois números inteiro
    public int somar(int a, int b){
        return a + b;
    }
    
    //Método 2: soma três números inteiro
    public int somar(int a, int b, int c){
        return a + b + c;
    }
    
    //Método 3: doma dois números decimais
    public double somar(double a, double b){
        return a + b;
    }
    
    public static void main(String[] args) {
        
        Aula21a total1 = new Aula21a();
        
        JOptionPane.showMessageDialog(null, 
                "Soma 1: " + total1.somar(13, 29));
        
        JOptionPane.showMessageDialog(null, 
                "Soma 2: " + total1.somar(13, 29, 42));
        
        JOptionPane.showMessageDialog(null, 
                "Soma 3: " + total1.somar(5.55, 122.4789));
        
        Livro livro1 = new Livro();
        livro1.titulo = "Sitio do Picapau Amarelo";
        livro1.paginas = 345;
        livro1.preco = 65.50;
        
        Livro livro2 = new Livro("Harry Potter");
        livro2.paginas = 894;
        livro2.preco = 345.00;
        
        Livro livro3 = new Livro("Java", 524, 87.90);
        livro3.paginas = 624;
                
                
        
    }
    
}
