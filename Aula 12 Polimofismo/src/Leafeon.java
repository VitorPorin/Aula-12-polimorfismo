public class Leafeon extends Eevee {
    //contrutor do Leafeon
    public Leafeon(String tipo, int altura, int HP, double peso){
        super(tipo, altura, HP, peso);
    }
    //sobrescrever os ataques de eevee para Leafeon
    public String ataque(){
        return "Folha Navalha - Razor Leaf:";       
    }
    @Override
    public String defesa(){
        return "Sintese - Synthesis";
    }
    @Override
    public String especial(){
        return "Lamina de Folhas - Leaf Blade";
        
    }
    //metodo imprimir
    @Override
    public void imprimir() {
        System.out.println("Leafeon ");
        System.out.println("  tipo='" + getTipo() + '\'');
        System.out.println("  altura=" + getAltura());
        System.out.println("  HP=" + getHP());
        System.out.println("  peso=" + getPeso());
        System.out.println("  Ataque: " + ataque());
        System.out.println("  Defesa: " + defesa());
        System.out.println("  Especial: " + especial());
    }
}