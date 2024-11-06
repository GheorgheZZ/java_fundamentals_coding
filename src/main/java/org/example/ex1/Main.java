package org.example.ex1;

/*
Sa se afiseze toate numerele de la 0 la 100.
Numerele pare sa aibe o identare de un tab.
 */
public class Main {
    public static void main(String[] args) {
        for(int i = 0; i <= 100; i++) {
            if(i % 2 == 0) { // conditie numere pare
                System.out.println("\t" + i);
                // nu am nevoie sa executi codul de mai jos
                // sari direct la urmatorul i
                continue;
            }

            System.out.println(i);
//            if(i % 2 == 0) { // conditie numere pare
//                System.out.println("\t" + i);
//            } else {
//                System.out.println(i);
//            }

        }
    }
}