/*
As lojas Marabia estão com uma promoção em todas linha de produtos.
Os produtos podem ser vendidos em até 10 vezes sem juros. Você foi
contratado para desenvolver um programa que executa as tarefas 
abaixo: Seu programa deve solicitar ao vendedor o nome do produto
que o cliente está adquirindo, o valor do produto, o número de 
parcelas que o cliente deseja parcelar e a data preferida para os
pagamentos. As datas disponíveis para pagamento são 5, 10, 15 e 25
de cada mês. Em seguida, seu programa deve imprimir uma caixa com
a data de vencimento de cada parcela e o valor de cada parcela.
Dicas: Para calcular o valor de cada parcela, divida o valor do 
produto pelo número de parcelas.
Considere o mês 01/2026 para o primeiro pagamento.
Exemplo: O cliente comprou um produto que custa R$ 400,00 em 4
vezes e vai pagar todo dia 15 de cada mês.
Venc. 15/01/26 - Parc. 1 - R$ 100,00
Venc. 15/02/26 - Parc. 2 - R$ 100,00
Venc. 15/03/26 - Parc. 3 - R$ 100,00
Venc. 15/04/26 - Parc. 4 - R$ 100,00
 */
package exercicio12a;
import javax.swing.JOptionPane;

public class Exercicio12a {

    public static void main(String[] args) {
        String titulo = "Lojas Marabia";
                
        String nomeProduto = JOptionPane.showInputDialog(
            null, "Digite o nome do produto: ",
            titulo, 3);
        String valorProd = JOptionPane.showInputDialog(
            null, "Digite o valor do produto: ",
            titulo, 3);
        int parcelas;
        do {
            String parc = JOptionPane.showInputDialog(
                null, "Digite o número de parcelas (1 a 10): ",
                titulo, 3);
            parcelas = Integer.parseInt(parc);
            if (parcelas < 1 || parcelas > 10){
                JOptionPane.showMessageDialog(null,
                    "Número de parcelas inválido.\n"
                    + "Digite as parcelas entre 1 e 10",
                    titulo, 0);
            }
        } while(parcelas < 1 || parcelas > 10);
        int diaP;
        do {
            String diaVenc = JOptionPane.showInputDialog(
                null, "Digite o dia de pagamento (5, 10, 15, 20): ",
                titulo, 3);
            diaP = Integer.parseInt(diaVenc);
            if (diaP != 5 && diaP != 10 && diaP != 15 && diaP != 20){
                JOptionPane.showMessageDialog(null,
                    "Data de vencimento inválida.\n"
                    + "Escolha entr as data 5, 10, 15 ou 20",
                    titulo, 0);
            }
        } while(diaP != 5 && diaP != 10 && diaP != 15 && diaP != 20);
        
        double valorProduto = Double.parseDouble(valorProd);
        double valorParcela = valorProduto / parcelas;
        
        int mesP = 1;
        int anoP = 2026;
        String msg = "";
        String valorParcela2 = String.format("%.2f", valorParcela);
        int contador = 1;
        
        while (contador <= parcelas){
            String data = diaP + "/" + mesP + "/" + anoP;
            msg = msg + "Venc. " + data + 
                    " - Parc. " + contador + 
                    " - R$ " + valorParcela2 +"\n";
            contador++;
            mesP++;
            if (mesP >12){
                mesP = 1;
                anoP++;
            }
        }
        JOptionPane.showMessageDialog(null, msg, titulo, 1);
        
    }
    
}
