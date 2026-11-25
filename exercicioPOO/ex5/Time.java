import java.util.ArrayList;
import java.util.List;

public class Time {

    private String nome;
    private String cidade;
    private List<Jogador> jogadores;          // Time possui vários Jogadores
    private EquipeTecnica equipeTecnica;      // Time possui somente uma EquipeTecnica

    public Time() {
        this.jogadores = new ArrayList<>();
    }

    public Time(String nome, String cidade, EquipeTecnica equipeTecnica) {
        this.nome = nome;
        this.cidade = cidade;
        this.equipeTecnica = equipeTecnica;
        this.jogadores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public EquipeTecnica getEquipeTecnica() {
        return equipeTecnica;
    }

    public void setEquipeTecnica(EquipeTecnica equipeTecnica) {
        this.equipeTecnica = equipeTecnica;
    }

    public void adicionarJogador(Jogador jogador) {
        this.jogadores.add(jogador);
    }

    public void exibirInformacoes() {
        System.out.println("=== Time ===");
        System.out.println("Nome: " + nome);
        System.out.println("Cidade: " + cidade);

        System.out.println("Jogadores:");
        for (Jogador j : jogadores) {
            System.out.println(" - " + j);
        }

        System.out.println("Equipe tecnica: " + equipeTecnica.getNome());
        System.out.println(" Tecnico: " + equipeTecnica.getTecnico());
        System.out.println(" Membros:");
        for (Membro m : equipeTecnica.getMembros()) {
            System.out.println("  - " + m);
        }
    }
}
