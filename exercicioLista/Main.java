public class Main {

    public static void main(String[] args) {
        String [] alunos = {"Miranata", "Savalo", "Aeronauta"};

        alunos[0] = "Mariazinha";

        System.out.println("Qtde de Alunos: " + alunos.length);

        for(String estudante : alunos){
           System.out.println(estudante);

        }
        String [] frutas = {"Banana", "Uva", "pera", "manga", "melao"};

        frutas[0] = "Macanzinha";

        System.out.println("Qtde de Frutas: " + frutas.length);

        for(String fruto : frutas){
           System.out.println(fruto);

        }

    }
    
}
