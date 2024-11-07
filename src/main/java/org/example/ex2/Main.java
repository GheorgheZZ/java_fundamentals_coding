package org.example.ex2;
/*
Write a program that uses a for loop to find the sum of the first 10 natural numbers.
Expected output: The sum of the first 10 natural numbers is: 45
 */
public class Main {
    public static void main(String[] args) {
        int sum =0;
        int num =9;
        int cifra =0;

        do {sum = sum + cifra;}
        while(num>cifra++);
        System.out.println("Suma primelor 10 numere naturale este "+sum);

    }
}
