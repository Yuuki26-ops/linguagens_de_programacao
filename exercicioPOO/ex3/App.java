public class App {
    public static void main(String[] args) {

        Linguagem[] linguagens = {
            new Linguagem("Java"),
            new Linguagem("Python"),
            new Linguagem("JavaScript")
        };

        SistemaOperacional[] sistemas = {
            new SistemaOperacional("Windows"),
            new SistemaOperacional("Linux")
        };

        Programador programador = new Programador(linguagens, 8, sistemas);
        programador.exibirInformacoes();
    }
}