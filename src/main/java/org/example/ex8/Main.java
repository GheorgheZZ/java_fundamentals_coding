package org.example.ex8;
import java.util.Scanner;
/*
Count Vowels in a String
Prompt the user to input a string, then use a loop to count the number of vowels (a, e, i, o, u) in it.
Expected output (for input "Hello World"): Vowels count: 3
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String propozitie = scanner.nextLine();
        char literaA = 'a';
        char literaE = 'e';
        char literaI = 'i';
        char literaO = 'o';
        char literaU = 'u';

        int repetare = 0;

        int lungime =propozitie.length();

        for (int i = 0; i < lungime; i++) {
            if(propozitie.charAt(i)==literaA){
                repetare++;
            }
            else if (propozitie.charAt(i)==literaE){
                repetare++;
            }
            else if (propozitie.charAt(i)==literaI) {
                repetare++;
            }
            else if (propozitie.charAt(i)==literaO) {
                repetare++;
            }
            else if (propozitie.charAt(i)==literaU) {
                repetare++;
            }
        }
        System.out.println("Vocalele se repeta de: "+repetare+" ori");
    }
}
