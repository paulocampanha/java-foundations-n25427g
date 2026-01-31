/* Nessa classe vamos criar os objetos do tipo FormaPagamento, CartaoDeCredito e
   BoletoBancario
 */
package aula24b;

public class Aula24b {

    public static void main(String[] args) {
        
        FormaPagamento cartao = new CartaoDeCredito();
        cartao.processarPagamento();
        cartao.exibirConfirmacao();
        
        FormaPagamento boleto = new BoletoBancario();
        boleto.processarPagamento();
        boleto.exibirConfirmacao();
    }
    
}
