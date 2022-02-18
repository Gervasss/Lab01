import java.util.Scanner;                                   // Importa o leitor do teclado

public class Questao3 {                                     // Define a classe
    public static void main (String[] args) {               // define a main principal

        Scanner teclado = new Scanner (System.in);          // Define um novo leitor de teclado
        final int CONST = 10;                               // Define uma constante e um valor

        double [] vetor = new double [CONST];               // cria um vetor e define a constante como o valor do vetor

        for (int i=0; i<CONST; i++){                        // Cria um for para a constante
            System.out.println("Digite o valor: ");         // imprime a mensagem "Digite o valor: "
            vetor [i] = teclado.nextDouble();               // Guarda o valor da entrada no vetor
        }

        for (int i=0; i<CONST; i++){                        // Cria um for para imprimir
            System.out.println((i+1) + " - " + vetor[i]);   // imprime a posição do vetor e o seu valor
        }   
    
    }
}