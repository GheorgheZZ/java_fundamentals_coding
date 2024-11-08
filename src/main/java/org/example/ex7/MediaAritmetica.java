package org.example.ex7;

import java.util.Scanner;

/*
Exercițiu: Media unor numere
Descriere: Scrie un program care să citească n numere de la tastatură și să calculeze media lor aritmetică.

Sugestie: Folosește o buclă for pentru a citi fiecare număr și a le aduna într-o variabilă, apoi împarte suma la n.
 */
public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți numărul de valori: ");
        int n = scanner.nextInt();

        double suma = 0;

        System.out.println("Introduceți valorile:");
        for (int i = 0; i < n; i++) {
            System.out.print("Număr " + (i + 1) + ": ");
            double numar = scanner.nextDouble();
            suma += numar;
        }
        double media = suma / n;
        System.out.println("Media numerelor introduse este: " + media);
        scanner.close();
    }
}

