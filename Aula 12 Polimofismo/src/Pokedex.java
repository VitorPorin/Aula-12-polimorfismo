public class Pokedex {
  
     public static void main (String [] args) throws Exception{
        

        // Criando um  Eevee
        Eevee e = new Eevee("Normal", 30, 55, 6.5);
        e.imprimir();
        
        System.out.println("");
        // Criando um Jolteon
        
        Jolteon j = new Jolteon("Eletrico", 80, 65, 24.5);
        j.imprimir();
    }
    
}
