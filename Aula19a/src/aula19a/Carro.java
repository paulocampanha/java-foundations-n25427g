/* Nesse classe vamos definir todos os atributos e métodos
   que devem compor os nosso objetos
 */
package aula19a;

import javax.swing.JOptionPane;

public class Carro {
    
    // Atributos (características)
    public String marca;
    public String modelo;
    public String cor;
    public int anoFabricacao;
    public int velocidadeAtual = 0;
    
    // Métodos (comportamentos)
    public void ligar(){
        JOptionPane.showMessageDialog(null,
                "O carro está ligado");
    }
    
    public void acelerar(int valor){
        velocidadeAtual += valor;
        JOptionPane.showMessageDialog(null,
            "Velocidade atual: " + velocidadeAtual
            + " Km/h");
    }
    
    public int frear(){
        velocidadeAtual = 0;
        return velocidadeAtual;
    }
    
    public void informacaoCarro(){
        String msg = "Marca: " + marca;
        msg += "\nModelo: " + modelo;
        msg += "\nCor: " + cor;
        msg += "\nAno Fabricação: " + anoFabricacao;
        
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
