/* Nessa classe vamos implementar os objetos das classe 
   Animal, Cachorro e Gato
 */
package aula20a;

public class Aula20a {

    public static void main(String[] args) {
        
        Animal meuAnimal = new Animal("Leão Simão", 10);
        Cachorro meuCachorro = new Cachorro("Bruce", 1, 
                "XouXou", "Grande");
        Gato meuGato = new Gato("Gaspar", 8, 
                "Curto", "Rajado");
        
        meuAnimal.comer();
        meuAnimal.exibirDetalhes();
        
        meuCachorro.comer();
        meuCachorro.latir();
        meuCachorro.exibirDetalhes();
        
        meuGato.comer();
        meuGato.miar();
        meuGato.exibirDetalhes();
    }
    
}
