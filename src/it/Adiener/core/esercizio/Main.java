package it.Adiener.core.esercizio;

import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {

        Scanner in = new Scanner ( System.in );

        System.out.println ( " inserisci il nome: " );

        String nome = " ";

        try {
            nome = in.nextLine ( );

            int l = nome.length ( );

            if (nome.length ( ) <= 3 || nome.length ( ) > 10) {
                throw new StudentNameException ( " il nome non è corretto: ", nome );
            }
        } catch (StudentNameException e) {
            System.out.println ( "Errore: " + e.getMessage ( ) + " valore fornito " + e.getErrName ( ) );
        }

        System.out.println ( "inserisci tre voti " );

        int[] voti = new int[ 3 ];

        for ( int i = 0; i < 3; i++ ) {
            try {

                int voto = Integer.parseInt ( in.nextLine ( ) );
                if (voto < 0 || voto > 10) {
                    throw new StudentVotesException ( "Il voto non rientra nel range", voto );
                }
                voti [ i ] = voto;

            } catch (NumberFormatException e) {
                System.out.println ( "Errore: " + e.getMessage ( ) );
            } catch (StudentVotesException e) {
                System.out.println ( e.getMessage ( ) );
            }

        }

        Student s1 = new Student ( nome, voti );
        Student s2 = new Student ( "Brodor", new int[] {3, 5, 7} );

        StudentComparator sc = new StudentComparator ( s1, s2);

        int res = sc.compare ( );

        switch ( res ) {
            case 1:
                System.out.println ("Lo studente migliore è " +  s1.getName ());
                break;
            case -1:
                System.out.println ("Lo studente migliore è " +  s2.getName ());
                break;
            case 0:
                System.out.println ( s1.getName ( ) + " " + s2.getName ( ) + " hanno la stessa media!" );
                break;
        }


        in.close ( );
    }
}
