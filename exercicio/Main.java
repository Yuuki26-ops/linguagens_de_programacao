package exercicio;


public class Main {
public static void main (String [] args) {


boolean luz = true; // true or false simples

if (luz) {

    System.out.println("Luz acesa");
}
else { 
    System.out.println("Luz Nao foi acesa");

}

boolean luz2 = false;

String mensagem = (luz2 == true) ? "Lampada acesa" : "Lampada apagada";
System.out.println(mensagem);

 int idade = 50; //metodo else de como saber idade, e outras informações
  
if (idade < 12)
    System.out.println("Criança");
else if (idade < 18)
    System.out.println("Adolescente");
else if (idade < 60)
    System.out.println("Adulto");
else if (idade > 60)
    System.out.println("Idoso");


}

} 