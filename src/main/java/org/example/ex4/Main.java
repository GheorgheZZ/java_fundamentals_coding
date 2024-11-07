package org.example.ex4;
import java.util.Scanner;
/*
Prompt the user for a number and use a while loop to calculate the sum of its digits.
Expected output (for input 123): The sum of digits of 123 is 6
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar: ");

        int number = scanner.nextInt();
        int digitsSum = 0;
        int digitsProd = 1;
        int copNumber = number;
        while (copNumber > 0)
        {
            digitsSum += (copNumber % 10);
            digitsProd *= (copNumber % 10);
            copNumber = copNumber / 10;
        }
        System.out.println("Suma cifrelor numarului " + number + " este " + digitsSum);
        System.out.println("Produsul cifrelor numarului " + number + " este " + digitsProd);
    }
}
