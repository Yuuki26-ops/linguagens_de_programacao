public class Programador {

    private Linguagem[] linguagem;
    private int nivel_cafeina;
    private SistemaOperacional[] sistema_operacional;

    public Programador() {
    }

    public Programador(Linguagem[] linguagem, int nivel_cafeina, SistemaOperacional[] sistema_operacional) {
        this.linguagem = linguagem;
        this.nivel_cafeina = nivel_cafeina;
        this.sistema_operacional = sistema_operacional;
    }

    public Linguagem[] getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(Linguagem[] linguagem) {
        this.linguagem = linguagem;
    }

    public int getNivel_cafeina() {
        return nivel_cafeina;
    }

    public void setNivel_cafeina(int nivel_cafeina) {
        this.nivel_cafeina = nivel_cafeina;
    }

    public SistemaOperacional[] getSistema_operacional() {
        return sistema_operacional;
    }

    public void setSistema_operacional(SistemaOperacional[] sistema_operacional) {
        this.sistema_operacional = sistema_operacional;
    }

    public void exibirInformacoes() {
        System.out.println("=== Programador ===");

        System.out.print("Linguagens: ");
        if (linguagem != null) {
            for (int i = 0; i < linguagem.length; i++) {
                System.out.print(linguagem[i] + (i < linguagem.length - 1 ? ", " : ""));
            }
        }
        System.out.println();

        System.out.println("Nivel de cafeina: " + nivel_cafeina);

        System.out.print("Sistemas operacionais: ");
        if (sistema_operacional != null) {
            for (int i = 0; i < sistema_operacional.length; i++) {
                System.out.print(sistema_operacional[i] + (i < sistema_operacional.length - 1 ? ", " : ""));
            }
        }
        System.out.println();
    }
}