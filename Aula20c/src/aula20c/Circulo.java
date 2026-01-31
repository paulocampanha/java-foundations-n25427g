/* Nessa classe vamos definir os atributos e métodos específicos
   do círculo e vamos herdar os atributos e métodos genéricos da
   classe FormaGeometrica
 */
package aula20c;

import javax.swing.JOptionPane;

public class Circulo extends FormaGeometrica {
    
    double raio;
    
    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }
    
    public double calcularArea(){
        double area = Math.PI * raio * raio;  // Math.PI retorna o número do PI
        return area;
    }
    
    // Sobrescrever os métodos da classe FormaGeometrica
    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        String msg = "Raio do Circulo: " + this.raio;
        JOptionPane.showMessageDialog(null, msg);
    }
    
    @Override
    public void desenhar(){
        JOptionPane.showMessageDialog(null,
            "Desenhando um círculo de raio " + this.raio + 
            " e cor " + this.cor + ".");
    }
    
}
