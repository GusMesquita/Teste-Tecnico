package src;

import java.util.Scanner;

public class ContagemA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe uma string: ");
        String s1 = sc.nextLine();

        int count = 0;
        for (char c : s1.toLowerCase().toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }

        System.out.println("A letra 'a' aparece " + count + " vezes. ");
        sc.close();
    }
}
