/*
Elabore um programa que solicita ao usuário a altura em metros e o peso em quilos. 
Calcule o IMC (Índice de Massa Corporal) usando a fórmula:
imc = peso / (altura * altura)
Em seguida, verifique o IMC dessa pessoa e imprima  sua classificação de acordo com a tabela abaixo:
IMC                   Classificação
Menor que 18,5        Magreza
18,5 a 24,9           Normal
25 a 29,9             Sobrepeso
30 a 34,9             Obesidade grau I
35 a 39,9             Obesidade grau II
Maior que 40          Obesidade grau III

Utilize JOptionPane para solicitar o peso e altura e para exibir a classificação.
 */
package exerciocio8a;
import javax.swing.JOptionPane;
public class Exerciocio8a {

    public static void main(String[] args) {
        
        String pesoString = JOptionPane.showInputDialog(null,
            "Digite seu peso em quilos (Ex.: 75,5): ",
            "Calculadora de IMC",
            1
        );
        
        String alturaString = JOptionPane.showInputDialog(null,
            "Digite sua altura em metros (Ex.: 1,75): ",
            "Calculadora de IMC",
            1
        );
        
        pesoString = pesoString.replace(",", ".");
        alturaString = alturaString.replace(",", ".");
        double peso = Double.parseDouble(pesoString);
        double altura = Double.parseDouble(alturaString);
        double imc = peso / (altura * altura);
        String imcFormat = String.format("%.1f", imc);
        
        if (imc < 18.5){
            JOptionPane.showMessageDialog(null, 
                "Seu IMC é "+imcFormat+". Você está abaixo do peso ideal",
                "Calculadora de IMC",
                1
            );
        } else if (imc >= 18.5 && imc <= 24.9 ) {
            JOptionPane.showMessageDialog(
                null, 
                "Seu IMC é "+imcFormat+". Você está com peso ideal",
                "Calculadora de IMC",
                1
            );
        } else if (imc >= 25 && imc <= 29.9 ) {
            JOptionPane.showMessageDialog(
                null, 
                "Seu IMC é "+imcFormat+". Você está com sobrepeso",
                "Calculadora de IMC",
                1
            );
        } else if (imc >= 30 && imc <= 34.9 ) {
            JOptionPane.showMessageDialog(
                null, 
                "Seu IMC é "+imcFormat+". Você está com Obesidade grau I",
                "Calculadora de IMC",
                1
            );
        } else if (imc >= 35 && imc <= 39.9 ) {
            JOptionPane.showMessageDialog(
                null, 
                "Seu IMC é "+imcFormat+". Você está com Obesidade grau II",
                "Calculadora de IMC",
                1
            );
        } else {
            JOptionPane.showMessageDialog(
                null, 
                "Seu IMC é "+imcFormat+". Você está com Obesidade grau III",
                "Calculadora de IMC",
                1
            );
        } 
    }
        
    
    
}
