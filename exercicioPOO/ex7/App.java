import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Categoria informatica = new Categoria("Informatica", "Computadores e perifericos");
        Categoria livros = new Categoria("Livros", "Livros tecnicos e literatura");

        Produto mouse = new Produto("Mouse sem fio", 89.90, informatica);
        Produto teclado = new Produto("Teclado mecanico", 249.90, informatica);
        Produto livroJava = new Produto("Java: Como Programar", 180.00, livros);

        Pedido pedido1 = new Pedido(1, LocalDate.of(2026, 11, 20));
        pedido1.adicionarProduto(mouse);
        pedido1.adicionarProduto(teclado);

        Pedido pedido2 = new Pedido(2, LocalDate.of(2026, 11, 25));
        pedido2.adicionarProduto(livroJava);

        Cliente cliente = new Cliente("Maria Oliveira", "maria@email.com");
        cliente.adicionarPedido(pedido1);
        cliente.adicionarPedido(pedido2);

        cliente.exibirInformacoes();
    }
}
