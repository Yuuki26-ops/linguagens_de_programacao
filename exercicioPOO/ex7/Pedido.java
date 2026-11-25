import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int numero;
    private LocalDate data;
    private List<Produto> produtos;   // Pedido possui vários Produtos

    public Pedido() {
        this.produtos = new ArrayList<>();
    }

    public Pedido(int numero, LocalDate data) {
        this.numero = numero;
        this.data = data;
        this.produtos = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido #" + numero + " (" + data + ")";
    }
}