public class Main {
    public void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Billy a cabra guerreira", 120, 20, 15);
        Mago mago = new Mago("Mago da paçoca", 80, 30, 30);
        Arqueiro arqueiro = new Arqueiro("Robin madeira", 90, 3, 25);

        guerreiro.exibirInformacoes();
        mago.exibirInformacoes();
        arqueiro.exibirInformacoes();

        guerreiro.golpear();
        mago.lancarMagia();
        arqueiro.atirar();

        while (mago.lancarMagia()) { }
        while (arqueiro.atirar()) { }

        System.out.println("Ações de batalha");
        System.out.println("----------------------");
        guerreiro.levaDano(40);
        guerreiro.recebeVida(25);
        mago.ganhaMoeda(120);
        arqueiro.gastaMoeda(30);
        guerreiro.ganhaNivel(1);
        System.out.println("----------------------");

        System.out.println("Stats perdidos e ganhos:");
        System.out.println("----------------------");
        System.out.println("Aragorn: vida " + guerreiro.getVida() + ", nível " + guerreiro.getNivel());
        System.out.println("Gandalf: moedas " + mago.getMoeda());
        System.out.println("Legolas: moedas " + arqueiro.getMoeda());
        System.out.println("----------------------");
    }
}
