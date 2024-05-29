public class Vaporeon extends Eevee {
    //contrutor do Vaporeon
    public Vaporeon(String tipo, int altura, int HP, double peso){
        super(tipo, altura, HP, peso);
    }
    //sobrescrever os ataques de eevee para Vaporeon
    @Override
    public String ataque(){
        return "Canhão d'agua - Hydro Pump";       
    }
    @Override
    public String defesa(){
        return "Proteção - Protect";
    }
    @Override
    public String especial(){
        return "Raio de gelo - Ice Beam";
        
    }
    //metodo imprimir
    @Override
    public void imprimir() {
        System.out.println("Vaporeon ");
        System.out.println("  tipo='" + getTipo() + '\'');
        System.out.println("  altura=" + getAltura());
        System.out.println("  HP=" + getHP());
        System.out.println("  peso=" + getPeso());
        System.out.println("  Ataque: " + ataque());
        System.out.println("  Defesa: " + defesa());
        System.out.println("  Especial: " + especial());
       
    }
}
