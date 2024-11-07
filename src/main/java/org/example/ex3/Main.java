package org.example.ex3;
import java.util.Scanner;
/*
Prompt the user for an integer and use conditional statements to check if the number is even or odd.
Expected output: Number 5 is odd.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar intreg:");
        int number = scanner.nextInt();

        while (number != 0)
            {
            if (number % 2 != 0)
                {
                System.out.println("Numarul " + number + " este impar");
                number = scanner.nextInt();
                }

            else
                {
                System.out.println("Numarul " + number + " este par");
                number = scanner.nextInt();
                }
            }
    }
}