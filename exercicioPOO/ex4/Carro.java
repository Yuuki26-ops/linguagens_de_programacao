import java.util.ArrayList;
import java.util.List;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private Motor motor;                   
    private List<Acessorio> acessorios;    

    public Carro() {
        this.acessorios = new ArrayList<>();
    }

    public Carro(String marca, String modelo, int ano, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
        this.acessorios = new ArrayList<>();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public List<Acessorio> getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(List<Acessorio> acessorios) {
        this.acessorios = acessorios;
    }

    public void adicionarAcessorio(Acessorio acessorio) {
        this.acessorios.add(acessorio);
    }

    public void exibirInformacoes() {
        System.out.println("=== Carro ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Motor: " + motor);
        System.out.println("Acessorios:");
        for (Acessorio a : acessorios) {
            System.out.println(" - " + a);
        }
    }
}