package org.example.ex13;
/*
Find Unique Elements
Write a program that prints only unique elements from an array of integers.
Expected output (for input [1, 2, 2, 3, 4, 4, 5]): Unique elements: 1, 3, 5
 */
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};

        int[] nr = new int[7];

        for (int i = 0; i < numbers.length; i++) {
            nr[i] = numbers[i];
        }
        System.out.println();
    }
}// trebuie de copiat apoi de comparat da mai bine un counter de facut care
// verifica cu 2 foruri daca sunt identice caracterele
