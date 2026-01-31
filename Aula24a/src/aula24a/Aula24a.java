/* Nessa classe vamos criar os objetos FormaGeometrica, Retangulo e Circulo
 */
package aula24a;

import javax.swing.JOptionPane;

public class Aula24a {

    public static void main(String[] args) {
        
        FormaGeometrica retangulo1 = new Retangulo(10, 5);
        FormaGeometrica circulo1 = new Circulo(7);
        
        JOptionPane.showMessageDialog(null, 
            "Área do retângulo: " + retangulo1.calcularArea());
        JOptionPane.showMessageDialog(null, 
            "Perímetro do retângulo: " + retangulo1.calcularPerimetro());
        
        JOptionPane.showMessageDialog(null, 
            "Área do círculo: " + circulo1.calcularArea());
        JOptionPane.showMessageDialog(null,
            "Perímetro do círculo: " + circulo1.calcularPerimetro());
    }
    
}
