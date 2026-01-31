/* Nessa classe vamos implementar os métodos da interface FormaGeometrica
 */
package aula24a;

import javax.swing.JOptionPane;

public class Circulo implements FormaGeometrica {
    
    private double raio;
    
    public Circulo(double raio){
        this.setRaio(raio);
    }
    
    public void setRaio(double raio){
        if (raio > 0){
            this.raio = raio;
        } else {
            JOptionPane.showMessageDialog(null,
                    "O raio não pode ser zero ou negativo.");
        }
    }
    
    @Override
    public double calcularArea(){
        double area = Math.PI * Math.pow(this.raio, 2);
        return area;
    }
    
    @Override
    public double calcularPerimetro(){
        double perimetro = 2 * Math.PI * raio;
        return perimetro;
    }
    
    
    
    
}
