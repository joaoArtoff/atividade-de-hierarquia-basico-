public class Guerreiro extends Character {

    private int forca;
    private int armadura;

    public Guerreiro(String nome, int vida, int forca, int armadura) {
        super(nome, "Guerreiro", 1, 100, vida);
        this.forca = forca;
        this.armadura = armadura;
    }

    public void golpear() {
        System.out.println(nome + " realizou um golpe com força " + forca + "!");
    }

    public void exibirInformacoes() {
        System.out.println("----------------------");
        super.exibirInformacoes();
        System.out.println("Força: " + forca);
        System.out.println("Armadura: " + armadura);
        System.out.println("----------------------");
    }
}
