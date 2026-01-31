/* Exercício: Conversor de Temperaturas Pro
1. Método Celsius para Fahrenheit: Crie um método chamado celsiusParaFahrenheit 
que receba uma temperatura em double (Celsius) e retorne o valor convertido.
 Fórmula: F = (C * 9/5) + 32
2. Método Fahrenheit para Celsius: Crie um método chamado  que receba uma 
temperatura em double (Fahrenheit) e retorne o valor convertido.
 Fórmula: C = (F - 32) * 5/9
3. Método Principal (main):
 Pergunte ao usuário qual a unidade de origem da temperatura atual (C ou F).
 Solicite o valor da temperatura.
 Utilize uma estrutura condicional (if/else) para chamar o método de conversão correto.
 Exiba o resultado formatado em uma janela de mensagem.
 */
package exercicio18a;

import javax.swing.JOptionPane;

public class Exercicio18a {    

    // Método 1: Recebe Celsius, retorna Fahrenheit
    public static double celsiusParaFahrenheit(double c) {
        double tempF = (c * 9 / 5) + 32;
        return tempF;
    }

    // Método 2: Recebe Fahrenheit, retorna Celsius
    public static double fahrenheitParaCelsius(double f) {
        double tempC =  (f - 32) * 5 / 9;
        return tempC;
    }
    
    public static void main(String[] args) {
        String opcao = JOptionPane.showInputDialog(
            "A temperatura atual está em:\n[C] Celsius\n[F] Fahrenheit");
        
        String temperatura = JOptionPane.showInputDialog(
            "Digite o valor da temperatura:");
        
        double tempInformada = Double.parseDouble(temperatura);

        if (opcao.equalsIgnoreCase("C")) {
            double resultado = celsiusParaFahrenheit(tempInformada);
            JOptionPane.showMessageDialog(null, 
                tempInformada + "°C equivale a " + 
                String.format("%.2f", resultado) + "°F");
            
        } else if (opcao.equalsIgnoreCase("F")) {
            double resultado = fahrenheitParaCelsius(tempInformada);
            JOptionPane.showMessageDialog(null, 
            tempInformada + "°F equivale a " + 
                String.format("%.2f", resultado) + "°C");
        } 
        else {
            JOptionPane.showMessageDialog(null, "Opção inválida!");
        }
    }
    
}
