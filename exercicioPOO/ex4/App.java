public class App {
    public static void main(String[] args) {

        Motor motor = new Motor(120, 1.6, "Flex");

        Carro carro = new Carro("Volkswagen", "Gol", 2022, motor);
        carro.adicionarAcessorio(new Acessorio("Ar-condicionado", 3500.00));
        carro.adicionarAcessorio(new Acessorio("Central multimidia", 1800.00));
        carro.adicionarAcessorio(new Acessorio("Sensor de re", 450.00));

        carro.exibirInformacoes();
    }
}
