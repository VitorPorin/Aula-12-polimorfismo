public class Jolteon extends Eevee {
    //contrutor do jolteon
    public Jolteon(String tipo, int altura, int HP, double peso){
        super(tipo, altura, HP, peso);
    }
    //sobrescrever os ataques de eevee para jolteon
    @Override
    public String ataque(){
        return "Trovoada - Thunder-Shock";       
    }
    @Override
    public String defesa(){
        return "Carga - Wild Charge";
    }
    @Override
    public String especial(){
        return "Raio - Thunder";
        
    }
    //metodo imprimir
    @Override
    public void imprimir() {
        System.out.println("Jolteon ");
        System.out.println("  tipo='" + getTipo() + '\'');
        System.out.println("  altura=" + getAltura());
        System.out.println("  HP=" + getHP());
        System.out.println("  peso=" + getPeso());
        System.out.println("  Ataque: " + ataque());
        System.out.println("  Defesa: " + defesa());
        System.out.println("  Especial: " + especial());
       
    }
}
