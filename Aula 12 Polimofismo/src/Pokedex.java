public class Pokedex {
  
     public static void main (String [] args) throws Exception{
        

        // Criando um  Eevee
        Eevee e = new Eevee("Normal", 30, 55, 6.5);
        e.imprimir();
        
        System.out.println("");
        // Criando um Jolteon
        
        Jolteon j = new Jolteon("Eletrico",  80, 65, 24.5);
        j.imprimir();

        System.out.println("");

        // Criando um Vaporeon
        Vaporeon v = new Vaporeon("Agua", 1, 130, 29);
        v.imprimir();
        System.out.println("");

        //Criando Flarion
        Flarion f = new Flarion("fogo", 90, 65, 25);
        f.imprimir();
        System.out.println(" ");

        //Criando Espeon
        Espeon es = new Espeon("Psiquico", 90, 65, 26.5);
        es.imprimir();
        System.out.println(" ");

        //Criando Umbreon
        Umbreon u = new Umbreon("Sombrio", 1, 95, 27);
        u.imprimir();
        System.out.println(" ");
        
        //Criando Leafeon
        Leafeon l = new Leafeon("Planta", 1, 65, 25.5);
        l.imprimir();
        System.out.println(" ");

        //Criando Glaceon
        Glaceon g = new Glaceon("Gelo", 80, 65, 25.9);
        g.imprimir();
        System.out.println(" ");

        //Criando Sylveon
        Sylveon s = new Sylveon("Fada", 1, 95, 23.5);
        s.imprimir();
    
    }
}
