import java.util.Scanner;
public class Character {

    protected String nome;
    protected String classe;
    protected int vidaMax = 80;
    protected int vidaAtual = vidaMax;
    protected int nivel = 1;
    protected int moeda = 100;

    public Character(String nome, String classe, int nivel, int moeda, int vidaMax){
        this.nome = nome;
        this.classe = classe;
        this.nivel = 1;
        this.moeda = 100;
        this.vidaMax = vidaMax;
        this.vidaAtual = vidaMax;
    }
    public String escolherNome() {
        System.out.println("Digite seu nome: ");
        Scanner sc = new Scanner(System.in);
        nome = sc.nextLine();
        return nome;
    }

    public String getNome(){
        return this.nome;
    }
    public String getClasse(){
        return this.classe;
    }
    public int getVida(){
        return this.vidaAtual;
    }
    public void levaDano(int dano){
        if (dano < 0) {
            System.out.println("Dano errado, tente novamente.");
            return;
        }

        this.vidaAtual -= dano;
        if (this.vidaAtual < 0){
            this.vidaAtual = 0;
        }

    }
    public void recebeVida(int qtdCura){
        this.vidaAtual += qtdCura;
        if (this.vidaAtual > this.vidaMax){
            this.vidaAtual = this.vidaMax;
        }
    }

    public int getNivel(){
        return this.nivel;

    }

    public void ganhaNivel(int qtdNivel){
        this.nivel += qtdNivel;
    }

    public int getMoeda() {
        return this.moeda;
    }

    public void ganhaMoeda(int moeda){
        this.moeda += moeda;
    }

    public void gastaMoeda(int valor){
        if(valor <0){
            System.out.println("valor do produto está errado, tente novamente.");
            return;
        }
        if(this.moeda > valor)
            this.moeda -= valor;

    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Vida: " + vidaAtual + "/" + vidaMax);
        System.out.println("Nível: " + nivel);
        System.out.println("Moedas: " + moeda);
    }
}
