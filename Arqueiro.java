public class Arqueiro extends Character {

    private int flechas;
    private int precisao;

    public Arqueiro(String nome, int vida, int flechas, int precisao) {
        super(nome, "Arqueiro", 1, 100, vida);
        this.flechas = flechas;
        this.precisao = precisao;
    }

    public boolean atirar() {
        if (flechas <= 0) {
            System.out.println(nome + " está sem flechas, habilidade não pode ser usada");
            return false;
        }
        flechas--;
        System.out.println(nome + " atirou uma flecha com precisão " + precisao
                + " Flechas restantes: " + flechas);
        return true;
    }

    public void exibirInformacoes() {
        System.out.println("----------------------");
        super.exibirInformacoes();
        System.out.println("Flechas: " + flechas);
        System.out.println("Precisão: " + precisao);
        System.out.println("----------------------");
    }
}
