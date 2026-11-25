public class App {
    public static void main(String[] args) {

        Tecnico tecnico = new Tecnico("Carlos Silva", 15);

        EquipeTecnica equipe = new EquipeTecnica("Comissao Tecnica Principal", tecnico);
        equipe.adicionarMembro(new Membro("Ana Souza", "Fisioterapeuta"));
        equipe.adicionarMembro(new Membro("Roberto Lima", "Preparador fisico"));
        equipe.adicionarMembro(new Membro("Paula Mendes", "Nutricionista"));

        Time time = new Time("Estrela FC", "Sao Paulo", equipe);
        time.adicionarJogador(new Jogador("Joao Pereira", 1, "Goleiro"));
        time.adicionarJogador(new Jogador("Lucas Santos", 9, "Atacante"));
        time.adicionarJogador(new Jogador("Pedro Alves", 10, "Meia"));

        time.exibirInformacoes();
    }
}