/* Polimorfismo por sobrecarga
 */
package aula21a;

public class Livro {
    
    String titulo;
    int paginas;
    double preco;
    
    public Livro(){
        
    }
    
    public Livro(String titulo){
        this.titulo = titulo;
        this.paginas = 0;
        this.preco = 0.0;
    }
    
    public Livro(String titulo, int paginas, double preco){
        this.titulo = titulo;
        this.paginas = paginas;
        this.preco = preco;
    }
}
