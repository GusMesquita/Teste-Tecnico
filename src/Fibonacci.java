package src;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = sc.nextInt();

        if (isFibonacci(num)) {
            System.out.println("O numero " + num + " pertence à sequência de Fibonacci. ");
        } else { 
            System.out.println("O numero " + num + " não pertence à sequência de Fibonacci. ");
        }
    
        sc.close();
    }

    public static boolean isFibonacci (int num) {
        int a = 0, b = 1, c = 0;
        while (c < num) {
            c = a + b;
            a = b; 
            b = c;
        }
        return c == num || num == 0;
    }
}
