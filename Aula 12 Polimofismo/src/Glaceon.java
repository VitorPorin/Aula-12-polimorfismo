public class Glaceon extends Eevee {
    //contrutor do Glaceon
    public Glaceon(String tipo, int altura, int HP, double peso){
        super(tipo, altura, HP, peso);
    }
    //sobrescrever os ataques de eevee para Glaceon
    public String ataque(){
        return "Respiração de gelo - Frost Breath:";       
    }
    @Override
    public String defesa(){
        return "Barreira - Barrier";
    }
    @Override
    public String especial(){
        return "Nevasca - Blizzard ";
        
    }
    //metodo imprimir
    @Override
    public void imprimir() {
        System.out.println("Glaceon ");
        System.out.println("  tipo='" + getTipo() + '\'');
        System.out.println("  altura=" + getAltura());
        System.out.println("  HP=" + getHP());
        System.out.println("  peso=" + getPeso());
        System.out.println("  Ataque: " + ataque());
        System.out.println("  Defesa: " + defesa());
        System.out.println("  Especial: " + especial());
    }
}