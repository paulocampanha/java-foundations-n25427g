/* Nessa classe vamor criar um objeto do tipo Carro e implementar seus
   Atributos e metodos
 */
package aula19a;

import javax.swing.JOptionPane;

public class Aula19a {

    public static void main(String[] args) {
        
        Carro meuCarro = new Carro();
        Carro minhaFilha = new Carro();
        
        // Atributos do meu carro
        meuCarro.marca = "Fiat";
        meuCarro.modelo = "Uno";
        meuCarro.cor = "Preto";
        meuCarro.anoFabricacao = 2000;
        
        // Metodos do meu carro
        meuCarro.ligar();
        meuCarro.acelerar(10);
        meuCarro.acelerar(30);
        JOptionPane.showMessageDialog(null,
            "Pisei no freio do carro e sua velocidade atual é "
            + meuCarro.frear() + " Km/h");
        
        // Atributos do carro da minha filha
        minhaFilha.marca = "VW";
        minhaFilha.modelo = "Fusca";
        minhaFilha.anoFabricacao = 1980;
        minhaFilha.cor = "Vermelhor";
        
        meuCarro.informacaoCarro();
        minhaFilha.informacaoCarro();
        
        Carro minhaEsposa = new Carro();
        
        minhaEsposa = meuCarro;
        
        meuCarro.cor = "Branco";
        
        minhaEsposa.informacaoCarro();
        
        minhaEsposa.cor="Rosa";
        meuCarro.informacaoCarro();
        
        
    }
    
}
