/* Nessa classe vamos implementar os métodos da interface FormaGeometrica
 */
package aula24a;

import javax.swing.JOptionPane;

public class Retangulo implements FormaGeometrica {
    
    private double base;
    private double altura;
    
    public Retangulo(double base, double altura) {
        this.setBase(base);
        this.setAltura(altura);
    }
    
    public void setBase(double base){
        if (base > 0) {
            this.base = base;
        } else {
            JOptionPane.showMessageDialog(null, 
                    "A base não pode ser zero ou negativa.");
        }
    }
    
    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            JOptionPane.showMessageDialog(null, 
                    "A altura não pode ser zero ou negativa.");
        }
    }
    
    @Override
    public double calcularArea() {
        double area = this.base * this.altura;
        return area;
    }
    
    @Override
    public double calcularPerimetro(){
        double perimetro = 2 * (this.base + this.altura);
        return perimetro;
    }
    
}
