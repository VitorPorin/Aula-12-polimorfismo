public class Eevee {
    private String tipo;
    private int altura;
    private int HP;
    private double peso;

    // Construtor padrão
    public Eevee() {
    }

    // Construtor com parâmetros
    public Eevee(String tipo, int altura, int HP, double peso) {
        this.tipo = tipo;
        this.altura = altura;
        this.HP = HP;
        this.peso = peso;
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Métodos de ataque, defesa e especial
    public String ataque() {
        return "Ataque rápido";
    }

    public String defesa() {
        return "Desvio";
    }

    public String especial() {
        return "Tri-ataque";
    }
    // metodo imprimir
    public void imprimir() {
        System.out.println("Eevee ");
        System.out.println("  tipo='" + tipo + '\'');
        System.out.println("  altura=" + altura);
        System.out.println("  HP=" + HP);
        System.out.println("  peso=" + peso);
        System.out.println("  Ataque: " + ataque());
        System.out.println("  Defesa: " + defesa());
        System.out.println("  Especial: " + especial());
        
    }
}
