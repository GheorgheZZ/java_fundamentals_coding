package org.example.ex11;

/*
Reverse Array
Write a program that reverses an array of integers.
Expected output (for input [1, 2, 3, 4, 5]): Reversed array: [5, 4, 3, 2, 1]
 */
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] numberReversed = new int[5];

//        for(int i=0; i<numbers.length; i++){
//
//        }
//        int index = 0;
//        for(int i=numbers.length-1;i>=0; i--){
//
//            numberReversed[index]=numbers[i];
//            index++;
//        }
        for (int i = numbers.length - 1; i >= 0; i--) {

            numberReversed[(numbers.length - 1) - i] = numbers[i];
            System.out.println("Indexul este: " + ((numbers.length - 1) - i));
        }
        for (int n : numberReversed) {
            System.out.println(n);
        }

    }
}
