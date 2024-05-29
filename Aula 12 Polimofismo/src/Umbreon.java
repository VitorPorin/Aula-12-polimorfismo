public class Umbreon extends Eevee {
    //contrutor do Umbreon
    public Umbreon(String tipo, int altura, int HP, double peso){
        super(tipo, altura, HP, peso);
    }
    //sobrescrever os ataques de eevee para Umbreon
    @Override
    public String ataque(){
        return "Revide - Payback:";       
    }
    @Override
    public String defesa(){
        return "Luz da lua - Monnlight";
    }
    @Override
    public String especial(){
        return "Jogo Sujo - Foul Play";
        
    }
    //metodo imprimir
    @Override
    public void imprimir() {
        System.out.println("Umbreon ");
        System.out.println("  tipo='" + getTipo() + '\'');
        System.out.println("  altura=" + getAltura());
        System.out.println("  HP=" + getHP());
        System.out.println("  peso=" + getPeso());
        System.out.println("  Ataque: " + ataque());
        System.out.println("  Defesa: " + defesa());
        System.out.println("  Especial: " + especial());
    }
}