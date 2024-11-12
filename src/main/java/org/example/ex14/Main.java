package org.example.ex14;

import java.util.Arrays;
import java.util.Scanner;

/*
Sort Array in Ascending Order
Sort an array of integers in ascending order.
Expected output (for input [5, 3, 8, 1, 2]): Sorted array: [1, 2, 3, 5, 8]
 */
public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2};
        Arrays.sort(numbers);// sorteaza numerele dintr-un array in ordine crescatoare, pentru asta e
        // necesar sa introducem clasa Arrays
        System.out.print("Sorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
