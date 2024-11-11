package org.example.ex10;

import java.util.Scanner;

/*
Remove Duplicate Characters
Prompt the user to enter a string, then remove any duplicate characters.
Expected output (for input "programming"): progamin
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti cuvantul");
        String text = scanner.nextLine();

        String textNou = "";

        for (int i = 0; i < text.length(); i++) {
            char litera = text.charAt(i);
            if (textNou.indexOf(litera) == -1) // verifica daca are carectere totuna sau daca nu are da -1
            {
                textNou += litera;
            }
        }
        System.out.println(textNou);
    }
}
