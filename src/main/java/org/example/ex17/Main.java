package org.example.ex17;
import java.util.Random;
import java.util.Scanner;
/*
Guess the Number
The program randomly selects a number within a certain range (e.g., 1 to 100).
The player has to guess the number. After each guess, the program tells the player if their guess was too high or too low.
The game ends when the player guesses the correct number, and the program displays the number of attempts.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ghiceste numarul intre 1 si 100");
        System.out.println("Introdu numarul: ");
        int computerInput = random.nextInt(100);
        int count =0;
        while (true) {
            int playerInput = scanner.nextInt();
            if (playerInput == computerInput) {
                System.out.println("Ai nimerit!");
                break;
            } else if (playerInput > computerInput) {
                System.out.println("Mai mic!");
                count++;
            } else if (playerInput < computerInput) {
                System.out.println("Mai mare!");
                count++;
            }

        }
        System.out.println("Ai facut "+count+" incercari");
    }
}
