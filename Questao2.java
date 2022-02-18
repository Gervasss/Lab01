import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        int number, inve;
        
        inv = 0;
        number = teclado.nextInt();
        while(number > 0) {
            inve *= 10;
            inve += (number % 10);
            number /= 10;
        }
        System.out.print("Numero invertido: " + inv);
    }
}
