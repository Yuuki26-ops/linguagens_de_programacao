import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private String cpf;
    private List<Endereco> enderecos;   // Cliente possui vários Endereços
    private List<Telefone> telefones;   // Cliente possui vários Telefones
    private List<Email> emails;         // Cliente possui vários Emails

    public Cliente() {
        this.enderecos = new ArrayList<>();
        this.telefones = new ArrayList<>();
        this.emails = new ArrayList<>();
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.enderecos = new ArrayList<>();
        this.telefones = new ArrayList<>();
        this.emails = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public void adicionarEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }

    public void adicionarTelefone(Telefone telefone) {
        this.telefones.add(telefone);
    }

    public void adicionarEmail(Email email) {
        this.emails.add(email);
    }

    public void exibirInformacoes() {
        System.out.println("=== Cliente ===");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);

        System.out.println("Enderecos:");
        for (Endereco e : enderecos) {
            System.out.println(" - " + e);
        }

        System.out.println("Telefones:");
        for (Telefone t : telefones) {
            System.out.println(" - " + t);
        }

        System.out.println("Emails:");
        for (Email e : emails) {
            System.out.println(" - " + e);
        }
    }
}
