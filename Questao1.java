import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
        
        int tipoFigura;
        
        System.out.println("Escolha o tipo de figura geométrica\n" + "1 - triangulo\n" + "2 - retângulo\n" + "3 - circulo \n");
        tipoFigura = teclado.nextInt();
        
        if(tipoFigura == 1){
            System.out.println("Escreva a base e a altura do triangulo:");
                
                int base = teclado.nextInt();
                int altura = teclado.nextInt();
                
                System.out.println("A área do triangulo é: " + (base * altura) / 2); 
        }
        
        if(tipoFigura == 2){
            System.out.println("Escreva a base e a altura do retangulo:");
                
                int base = teclado.nextInt();
                int altura = teclado.nextInt();
                
                System.out.println("A área do retângulo é: " + base * altura); 
        }
        
        if(tipoFigura == 3){
            System.out.println("Escreva o raio do circulo:");
                
                double raio = teclado.nextDouble();
                double p = 3.14;
                System.out.println("A área do circulo é: " + (p * (raio*raio))); 
        }
        
        
                
    
    }
}