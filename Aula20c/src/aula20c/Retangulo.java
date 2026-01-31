/* Nessa classe vamos definir os atributos e métodos específicos
   do retângulo e vamos herdar os atributos e métodos genéricos da
   classe FormaGeometrica
 */
package aula20c;

import javax.swing.JOptionPane;

public class Retangulo extends FormaGeometrica {
    
    double lado;
    double altura;
    
    // Construtor
    public Retangulo(String cor, double lado, double altura) {
        super(cor);
        this.lado = lado;
        this.altura = altura;
    }
    
    public double calcularArea(){
        double area = lado * altura;
        return area;
    }
    
    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        String msg = "Lado do retângulo: " + this.lado;
        msg += "\nAltura do retângulo: " + this.altura;
        JOptionPane.showMessageDialog(null, msg);
    }
    
    @Override
    public void desenhar(){
        JOptionPane.showMessageDialog(null, 
            "Desenhando um retângulo de lado " + this.lado + 
            ", altura " + this.altura + " e cor " + this.cor + ".");
    }
}
