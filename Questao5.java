import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        final int NUM_FUNCIONARIO = 50;
        int[] vet = new int[NUM_FUNCIONARIO];
        int med = 0, quant = 0;

        for(int i = 0; i < NUM_FUNCIONARIO; i++) {
            System.out.println("Digite o salário dos funcionarios: ");
            vet[i] = entrada.nextInt();
            med += vet[i];
        }
        // ----
        med /= NUM_FUNCIONARIO;
        // ----
        for(int i = 0; i < NUM_FUNCIONARIO; i++) {
            if(vet[i] > med) {
                quant++;
            }
        }
        System.out.println("Media: " + med +"\nFuncionarios acima da media: " + quant);
    }
}
