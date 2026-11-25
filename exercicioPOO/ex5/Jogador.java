public class Jogador {

    private String nome;
    private int numeroCamisa;
    private String posicao;

    public Jogador() {
    }

    public Jogador(String nome, int numeroCamisa, String posicao) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return numeroCamisa + " - " + nome + " (" + posicao + ")";
    }
}