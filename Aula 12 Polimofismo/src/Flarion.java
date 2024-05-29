public class Flarion extends Eevee {
    //contrutor do Flarion
    public Flarion(String tipo, int altura, int HP, double peso){
        super(tipo, altura, HP, peso);
    }
    //sobrescrever os ataques de eevee para Flarion
    @Override
    public String ataque(){
        return "Lança-Chama - Flamethrower:";       
    }
    @Override
    public String defesa(){
        return "Dia de Sol - Sunny day";
    }
    @Override
    public String especial(){
        return "Ataque Flamejante - Fire Blitz";
        
    }
    //metodo imprimir
    @Override
    public void imprimir() {
        System.out.println("Flarion ");
        System.out.println("  tipo='" + getTipo() + '\'');
        System.out.println("  altura=" + getAltura());
        System.out.println("  HP=" + getHP());
        System.out.println("  peso=" + getPeso());
        System.out.println("  Ataque: " + ataque());
        System.out.println("  Defesa: " + defesa());
        System.out.println("  Especial: " + especial());
    }
}