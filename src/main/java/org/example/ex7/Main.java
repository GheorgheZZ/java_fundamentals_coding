package org.example.ex7;

import java.util.Scanner;

/*
String Length and Character Count
Ask the user for a string input. Print the length of the string and count how many times the character a appears.
Expected output (for input "Java programming"): Length: 16, Count of 'a': 3
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String propozitie = scanner.nextLine();
        char litera = 'a';
        int repetare = 0;

        int lungime =propozitie.length();
        System.out.println("Lungimea: "+lungime);

        for (int i = 0; i < lungime; i++) {
            if(propozitie.charAt(i)==litera){
                repetare++;
            }
        }
        System.out.println("Litera a se repeta de "+repetare+" ori");

    }
}
