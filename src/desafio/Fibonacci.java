package desafio;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número inteiro positivo: ");
        final int numero = scanner.nextInt();
        scanner.close();

        if (pertenceFibonacci(numero)) {
            System.out.printf("%d pertence à sequência de Fibonacci.%n", numero);
        } else if (numero < 0){
        	System.out.printf("%d não é um número inteiro positivo.%n", numero);
        }else {
            System.out.printf("%d não pertence à sequência de Fibonacci.%n", numero);
        }
    }

    private static boolean pertenceFibonacci(final int numero) {
        int a = 0, b = 1, c = 1;
        
        while (c <= numero) {
            if (c == numero) {
                return true;
            }
            a = b;
            b = c;
            c = a + b;
        }

        return false;
    }
}