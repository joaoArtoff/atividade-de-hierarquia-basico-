public class Mago extends Character {

    private int custoMana = 10;
    private int mana;
    private int poderMagico;

    public Mago(String nome, int vida, int mana, int poderMagico) {
        super(nome, "Mago", 1, 100, vida);
        this.mana = mana;
        this.poderMagico = poderMagico;
    }

    public boolean lancarMagia() {
        if (mana < custoMana) {
            System.out.println(nome + " não tem mana para usar a habilidade (atual mana: " + mana + ")");
            return false;
        }
        mana -= custoMana;
        System.out.println(nome + " lançou uma magia com poder " + poderMagico
                + " Mana restante: " + mana);
        return true;
    }

    public void exibirInformacoes() {
        System.out.println("----------------------");
        super.exibirInformacoes();
        System.out.println("Mana: " + mana);
        System.out.println("Poder mágico: " + poderMagico);
        System.out.println("----------------------");
    }
}
