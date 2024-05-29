public class Espeon extends Eevee {
    //contrutor do Espeon
    public Espeon(String tipo, int altura, int HP, double peso){
        super(tipo, altura, HP, peso);
    }
    //sobrescrever os ataques de eevee para Espeon
    @Override
    public String ataque(){
        return "raio Psiquico - Psybeam:";       
    }
    @Override
    public String defesa(){
        return "Sol da Manha - Moning Sun";
    }
    @Override
    public String especial(){
        return "ataque Psiquico - Psychic";
        
    }
    //metodo imprimir
    @Override
    public void imprimir() {
        System.out.println("Espeon ");
        System.out.println("  tipo='" + getTipo() + '\'');
        System.out.println("  altura=" + getAltura());
        System.out.println("  HP=" + getHP());
        System.out.println("  peso=" + getPeso());
        System.out.println("  Ataque: " + ataque());
        System.out.println("  Defesa: " + defesa());
        System.out.println("  Especial: " + especial());
    }
}