package org.example.ex6;
import java.util.Scanner;

/*
Palindromic String Checker
Prompt the user for a String and check if it reads the same backward.
Expected output (for input ANA): ANA is a palindrome.
 */
public class MainString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu un nume: ");
        String nume = scanner.nextLine();

        boolean palindrom = true;
        int lungime =nume.length();

        for (int i = 0; i < lungime / 2; i++) {
            if (nume.charAt(i) != nume.charAt(lungime - i - 1)) {
                palindrom = false;
                break;
            }
        }

        if (palindrom) {
            System.out.println( nume + " Palindrom");
        } else {
            System.out.println(nume + " Nu e palindrom");
        }

    }
}
