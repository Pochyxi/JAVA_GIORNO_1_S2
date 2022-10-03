package it.Adiener.core;

import java.util.Scanner;

public class Giorno1_3 {

    public static void main ( String[] args ) {

        Scanner in = new Scanner(System.in);

        System.out.println ( "dammi x: " );

        try {
            int x = Integer.parseInt(in.nextLine());
        }
        catch ( NumberFormatException exc) {
            System.out.println("Dammi un numero!!!");
        }

        System.out.println ( "dammi y: " );

        try {
            int y = Integer.parseInt(in.nextLine());
        }
        catch ( NumberFormatException exc) {
            System.out.println("Dammi un numero!!!");
        }
    }
}
