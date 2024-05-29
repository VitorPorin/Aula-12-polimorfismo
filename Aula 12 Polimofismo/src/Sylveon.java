public class Sylveon extends Eevee {
    //contrutor do Sylveon
    public Sylveon(String tipo, int altura, int HP, double peso){
        super(tipo, altura, HP, peso);
    }
    //sobrescrever os ataques de eevee para Sylveon
    public String ataque(){
        return "Vento Encantado - Wind fairy:";       
    }
    @Override
    public String defesa(){
        return "Terreno mistico - Misty Terrain";
    }
    @Override
    public String especial(){
        return "Exploção Lunar - MoonBlast";
        
    }
    //metodo imprimir
    @Override
    public void imprimir() {
        System.out.println("Sylveon ");
        System.out.println("  tipo='" + getTipo() + '\'');
        System.out.println("  altura=" + getAltura());
        System.out.println("  HP=" + getHP());
        System.out.println("  peso=" + getPeso());
        System.out.println("  Ataque: " + ataque());
        System.out.println("  Defesa: " + defesa());
        System.out.println("  Especial: " + especial());
    }
}