/* Nessa classe vamos implementar os objetos das classe FiguraGeometrica,
   Circulo e Retangulo
 */
package aula20c;

import javax.swing.JOptionPane;

public class Aula20c {

    public static void main(String[] args) {
        
        FormaGeometrica forma = new FormaGeometrica("Vermelho");
        forma.desenhar();
        forma.exibirDetalhes();
        
        Circulo circulo1 = new Circulo("Azul", 5.0);
        Retangulo retangulo1 = new Retangulo("Amarelo", 6.0, 3.0);
        
        circulo1.desenhar();
        circulo1.exibirDetalhes();
        JOptionPane.showMessageDialog(null, 
            "Área do círculo: " + 
            String.format("%.2f", circulo1.calcularArea()));
        
        retangulo1.desenhar();
        retangulo1.exibirDetalhes();
        double area = retangulo1.calcularArea();
        JOptionPane.showMessageDialog(null, 
            "Área do retângulo: " + 
            String.format("%.2f", area));
        
    }
    
}
