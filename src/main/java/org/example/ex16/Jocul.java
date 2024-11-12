package org.example.ex16;

import java.util.Random;
import java.util.Scanner;

/*
Rock, Paper, Scissors
The player chooses rock, paper, or scissors.
The program randomly selects an option for the computer.
It then compares the choices and declares a winner (player, computer, or a tie).
 */
public class Jocul {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"piatra", "hartie", "foarfece"};

        while (true) {

            System.out.println("Alege dintre piatra, hartie, foarfece");
            String playerInput = scanner.nextLine();

            if (playerInput.equalsIgnoreCase("exit")) {
                break;
            }
            String computerInput = options[random.nextInt(3)];
            System.out.println("Calculator: " + computerInput);


            if (playerInput.equalsIgnoreCase(computerInput)) {
                System.out.println("Remiza!");
            } else if ((playerInput.equalsIgnoreCase("piatra") && computerInput.equalsIgnoreCase("foarfece")) ||
                    (playerInput.equalsIgnoreCase("foarfece") && computerInput.equalsIgnoreCase("hartie")) ||
                    (playerInput.equalsIgnoreCase("hartie") && computerInput.equalsIgnoreCase("piatra"))
            ) {
                System.out.println("Ai castigat!");
            } else {

                System.out.println("Ai pierdut!");
            }
        }
    }
}
