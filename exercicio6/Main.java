package exercicio6;

public class Main {
    public static void main(String[] args) {
        
    
    int[][] numeros= { 
        {1, 4, 2, 9}, 
        {3, 6, 8, 7}, 
        {30, 25, 32, 98},
        {0, 15, 12, 5}
    };
    
    System.out.println(numeros[2][3]);

    int [][] numeros = {
    {1, 4, 2},
    {3, 6, 8, 5, 2}

    }
    for(int[] linha: numeros) {
        for(int num : linha) {
            System.out.println(num);
        }
    }
}
}
