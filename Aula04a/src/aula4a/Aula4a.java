/*
 * Nesse programa vamos estudar o uso do método String.format(). 
 * Esse método produz uma string formatada (similar ao printf)
*/
package aula4a;

/**
 *
 * @author sn1085640
 */
public class Aula4a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String produto = "Notebook Pro";
        double preco = 2499.5566;
        int estoque = 15;
        double imposto = 0.18;
        
        String relatorio1 = String.format(
                "O produto %s tem %d unidades em estoque",produto,estoque);
        System.out.println(relatorio1);
        
        String relatorio2 = String.format("Preco bruto: R$ %,.2f.", preco);
        System.out.println(relatorio2);
        
        String taxaImposto = String.format("Imposto: %.1f%%", imposto * 100);
        System.out.println(taxaImposto);
    }
    
}
