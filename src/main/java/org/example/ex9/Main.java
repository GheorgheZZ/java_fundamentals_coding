package org.example.ex9;
import java.util.Scanner;
/*
Count Uppercase and Lowercase Letters
Write a program to count how many uppercase and lowercase letters are in a given string.
Expected output (for input "Hello World"): Uppercase letters: 2, Lowercase letters: 8
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti propozitia");
        String propozitie = scanner.nextLine();
        int lungime = propozitie.length();
        int litereMari = 0;
        int litereMici = 0;
        int spatiuRepet = 0;
        char spatiu = ' ';
        for (int i = 0; i < lungime; i++) {
            if (Character.isUpperCase(propozitie.charAt(i))) {
                litereMari++;
            } else if (propozitie.charAt(i) == spatiu) {
                spatiuRepet++;
            } else if (Character.isLowerCase(propozitie.charAt(i))) {
                litereMici++;
            }
        }
        System.out.println("In text sunt " + litereMari + " litere mari si " + litereMici + " litere mici");
    }
}
