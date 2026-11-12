import java.util.List;
import java.util.ArrayList;
public class Main{
    private static List<Professor> professor =  new ArrayList<>();
    private static List<Aluno> aluno = new ArrayList<>();
public static void main(String[] args) {
    professor.add(new Professor("Amarillo"));
    professor.add(new Professor("Diogasso"));
    professor.add(new Professor("nerso"));

    aluno.add(new Aluno("Lex Lutor"));
    aluno.add(new Aluno("Diogo lindo"));


   for(Professor prof : professor) {
    System.out.println("Nome: " + prof.getNome());
   
   }
   for (Aluno al : aluno){
     System.out.println("Nome de Aluno: " + al.getNome());
   }

}

}