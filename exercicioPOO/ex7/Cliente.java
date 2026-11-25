import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private String email;
    private List<Pedido> pedidos;   // Cliente possui vários Pedidos

    public Cliente() {
        this.pedidos = new ArrayList<>();
    }

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.pedidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void adicionarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public void exibirInformacoes() {
        System.out.println("=== Cliente ===");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);

        for (Pedido pedido : pedidos) {
            System.out.println();
            System.out.println(pedido);
            for (Produto produto : pedido.getProdutos()) {
                System.out.println("  - " + produto);
            }
            System.out.println("  Total: R$ " + String.format("%.2f", pedido.calcularTotal()));
        }
    }
}
