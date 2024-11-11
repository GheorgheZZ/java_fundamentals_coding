package org.example.ex12;
/*
Calculate Sum and Average
Given an array of integers, calculate the sum and average of its elements.
Expected output (for input [2, 4, 6, 8, 10]): Sum: 30, Average: 6.0
 */
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        int average = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            sum = sum+numbers[(numbers.length - 1) - i];
            average =sum/numbers.length;
        }
        System.out.println("Suma este "+sum);
        System.out.println("Media aritmetica este "+average);
    }
}
