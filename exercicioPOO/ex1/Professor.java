public class Professor {
 String nome;
 int quantidadeCafe = 0;
 String humor;
 String nivelDePaciencia;
 boolean usaDatashow = false;
 String fraseFavorita;

 public Professor(String nome, int quantidadeCafe, String humor, String nivelDePaciencia, boolean usaDatashow, String fraseFavorita) {

    this.nome = nome;
    this.quantidadeCafe  = quantidadeCafe;
    this.humor = humor;
    this.nivelDePaciencia = nivelDePaciencia;
    this.usaDatashow = usaDatashow;
    this.fraseFavorita = fraseFavorita;
    

}
public void setNome(String nome){
    this.nome = nome;
  }
  
  public String getNome() {
      return this.nome;
  }
  
  
  public void setquantidadeCafel(int quantidadeCafe){
     this.quantidadeCafe = quantidadeCafe;
  }
  
  public int getquantidadeCafe() {
      return this.quantidadeCafe;
  }
  
  
   public void setInteligente(String humor){
     this.humor = humor;
   }
  
   public String gethumor() {
      return this.humor;
  }
  
  
  
  public void setnivelDePaciencia(String nivelDePaciencia){
     this.nivelDePaciencia = nivelDePaciencia;
  }
  
  public String getnivelDePaciencia() {
      return this.nivelDePaciencia;
  }
  
  public void setusaDatashow(boolean usaDatashow){
     this.usaDatashow = usaDatashow;
  }
  
  public boolean getusaDatashow() {
      return this.usaDatashow;
  }

  public void setfraseFavorita(String fraseFavorita){
    this.fraseFavorita = fraseFavorita;
 }
 
 public String getfraseFavorita() {
     return this.fraseFavorita;
 }

  
  public void ensinar() {
      System.out.println("professor finge ensinar!");
  }
  
  public void tomarCafe(){
      System.out.println("professor toma café!");
  }
  
  
  }
  
  
  
