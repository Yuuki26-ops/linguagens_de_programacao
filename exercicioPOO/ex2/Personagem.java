import java.util.List;
import java.util.ArrayList;

public class Personagem {
    String nome;
    int vida;
    List<Tipo> tipos = new ArrayList<>();
    List<Poder> poderes = new ArrayList<>();

    public Personagem(String nome, int vida, String tipo, String poder){
        this.nome = nome;
        this.vida = vida;
        Tipo tipo1 = new Tipo(tipo);
        this.tipos.add(tipo1);
        Poder poder1 = new Poder(poder);
        this.poderes.add(poder1);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public int getVida(){
        return this.vida;
    }

    public void setTipo(String nome){
        Tipo tipo1 = new Tipo(nome);
        this.tipos.add(tipo1);
    }

    public List<Tipo> getTipo(){
        return this.tipos;
    }

    public void setPoder(String descricao){
        Poder poder1 = new Poder(descricao);
        this.poderes.add(poder1);
    }

    public List<Poder> getPoder(){
        return this.poderes;
    }

    public static void main(String[] args){

        Personagem persona_1 = new Personagem("Bem 10", 100, "Mutante", "Transformar");
        persona_1.setPoder("Mutação");
        persona_1.setPoder("Visão de Raio-X");
        persona_1.setPoder("Choque");
        persona_1.setPoder("Invisibilidade");

        Personagem persona_2 = new Personagem("Super-Man", 90, "Super Herói", "Voar");
        persona_2.setTipo("Alienígena");
        persona_2.setPoder("Soltar Raio Laser");
        persona_2.setPoder("Super Força");


        List<Personagem> personagens = new ArrayList<>();
        personagens.add(persona_1);
        personagens.add(persona_2);
    

        for (Personagem persona : personagens) {
            System.out.println("Nome: " + persona.getNome());
            System.out.println("Vida: " + persona.getVida());

            for (Tipo tipo : persona.getTipo()) {
                System.out.println("Tipo: "+ tipo.getNome());
            }

            for (Poder poder : persona.getPoder()) {
                System.out.println("Poder: " + poder.getDescricao());
            }

            System.out.println("################################### \n");
        }

        

    }
}


