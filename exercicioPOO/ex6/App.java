public class App {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Maria Oliveira", "123.456.789-00");

        cliente.adicionarEndereco(new Endereco("Rua das Flores", 120, "Ilha Solteira", "SP"));
        cliente.adicionarEndereco(new Endereco("Av. Brasil", 450, "Aracatuba", "SP"));

        cliente.adicionarTelefone(new Telefone("18", "99999-1111"));
        cliente.adicionarTelefone(new Telefone("18", "3333-2222"));

        cliente.adicionarEmail(new Email("maria@email.com", "Pessoal"));
        cliente.adicionarEmail(new Email("maria@empresa.com", "Trabalho"));

        cliente.exibirInformacoes();
    }
}
