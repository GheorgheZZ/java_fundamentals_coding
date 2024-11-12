package org.example.ex15;

import java.util.Random;
import java.util.Scanner;

public class JoculFoarfeca {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Introduceți un număr (3 pentru a opri): ");
            int numar = scanner.nextInt();
            numar = scanner.nextInt();
            int randomCifre = random.nextInt(3);

            if (numar == 3) {
                System.out.println("Ați introdus 3. Ieșire din loop.");
                break;
            }
            System.out.println("Alegeti vrianta:");
            System.out.println("Foarfece introduceti 0 ");
            System.out.println("Piatra introduceti   1 ");
            System.out.println("Hartie introduceti   2 ");

            /////Foarfece
            if(randomCifre==0 && numar==0 ){
                System.out.println("Foarfece!");
                System.out.println("Draw!");
            }
            else if(randomCifre==0 && numar==1 ){
                System.out.println("Foarfece!");
                System.out.println("Ai pierdut!");
            }
            else if(randomCifre==0 && numar==2 ){
                System.out.println("Foarfece!");
                System.out.println("Ai castigat");
            }
            ////////piatra
            if(randomCifre==1 && numar==0 ){
                System.out.println("Piatra!");
                System.out.println("Ai castigat!");
            }
            else if(randomCifre==1 && numar==1 ){
                System.out.println("Piatra!");
                System.out.println("Draw!");
            }
            else if(randomCifre==1 && numar==2 ){
                System.out.println("Piatra!");
                System.out.println("Ai pierdut!");
            }
            /////Hartie
            if(randomCifre==2 && numar==0 ){
                System.out.println("Hartie!");
                System.out.println("Ai pierdut!");
            }
            else if(randomCifre==2 && numar==1 ){
                System.out.println("Hartie!");
                System.out.println("Ai castigat!");
            }
            else if(randomCifre==1 && numar==2 ){
                System.out.println("Hartie!");
                System.out.println("Draw!");
            }

        }
    }
}
