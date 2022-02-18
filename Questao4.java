import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vetor = new int[5];

            
            for (int i=0; i<5; i++){
                System.out.println("Digite um inteiro: ");
                vetor[i] = teclado.nextInt();
            }

             
            for (int i = 0; i < 5; i++){
                int x = vetor[i] % 2;
            if (x == 0){
                vetor[i] = 1;
            }  else {
                vetor[i] = -1;
                }
            }

            
            for(int i = 0; i < 5; i++){
            System.out.println(vetor[i]); 
            }
        }
    }