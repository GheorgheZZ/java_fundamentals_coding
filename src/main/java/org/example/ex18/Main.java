package org.example.ex18;

import java.util.Random;
import java.util.Scanner;

/*Hangman
The program selects a random word, and the player tries to guess it by suggesting letters.
The player has a limited number of incorrect guesses, and each correct guess reveals letters in the word.
The game ends when the player guesses the word or runs out of attempts.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] cuvintAles = {"ieri", "astazi", "miine"};
        String computerInput = cuvintAles[random.nextInt(cuvintAles.length)];
        char[] cuvantGicit = new  char[cuvintAles.length];

        System.out.println(computerInput);

    }
}
