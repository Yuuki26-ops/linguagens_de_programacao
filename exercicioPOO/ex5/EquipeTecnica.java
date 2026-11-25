import java.util.ArrayList;
import java.util.List;

public class EquipeTecnica {

    private String nome;
    private Tecnico tecnico;          // EquipeTecnica possui somente um Técnico
    private List<Membro> membros;     // EquipeTecnica possui vários Membros

    public EquipeTecnica() {
        this.membros = new ArrayList<>();
    }

    public EquipeTecnica(String nome, Tecnico tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.membros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public List<Membro> getMembros() {
        return membros;
    }

    public void setMembros(List<Membro> membros) {
        this.membros = membros;
    }

    public void adicionarMembro(Membro membro) {
        this.membros.add(membro);
    }

    @Override
    public String toString() {
        return nome;
    }
}
