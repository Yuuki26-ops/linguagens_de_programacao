public class Main {
public static void main(String[] args) {
    
    String DeuCerto = "Hello World";

    System.out.println(DeuCerto.length());
    System.out.println(DeuCerto.toUpperCase());
    System.out.println(DeuCerto.toLowerCase());
    System.out.println(DeuCerto.indexOf("W"));
    System.out.println(DeuCerto.charAt(7));

   //Padrão sake_case

   String aluno_1 = "Diogo";
   String aluno_2 = "Salmuel";

   System.out.println(aluno_1.equals(aluno_2)); //false

   String  mensagem = " Hello World ";
   System.out.println("-" + mensagem.trim() + "-");

   String nome = "Diogo";
   String sobrenome = "Camargo";
   System.out.println(nome + " " + sobrenome);
   String aluno_3 = "Matheus Silva";
   System.out.println(aluno_3.contains("Silva"));

   String aluno_4 = "";
   System.out.println(aluno_4.isEmpty());

   String frutas = String.join("-", "Banana", "Abacaxi"); 
   System.out.println(frutas);

   String nome_completo = "Del Lokom Pirom";
   System.out.println(nome_completo.replace("m", "n"));


   String texto = "Boa noite!!";
   System.out.println(texto.substring(4, 9));

   String frase = "Repetição com correcao leva a perfeicao";
   System.out.println(frase);
}



}