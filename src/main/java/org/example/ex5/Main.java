package org.example.ex5;
import java.util.Scanner;
/*
Palindromic Number Checker
Prompt the user for a number and check if it reads the same backward.
Expected output (for input 121): 121 is a palindrome.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu un numar: ");
        int number = scanner.nextInt();

        int numarIntrodus = number;
        int numarIntors = 0;

        while (number != 0) {
            int cifra = number % 10;
            numarIntors = numarIntors * 10 + cifra;
            number /= 10;
        }

        if (numarIntrodus == numarIntors) {
            System.out.println(numarIntrodus + " Palindrom.");
        } else {
            System.out.println(numarIntrodus + " Nu e palindrom");
        }
    }
}

