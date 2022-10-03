package it.Adiener.core;

public class Main {

    public static void main ( String[] args ) {
//        m1 ();

        String s = null;

        try {
            try {
                System.out.println ( 10 / 0 );
                int[] numbers = { 10, 20, 30, 40 };
                System.out.println ( numbers[ 5 ] );
                System.out.println ( s.length ( ) );
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println ( "Index fuori range" );
            } catch (NullPointerException exc) {
                System.out.println ( "la stringa è null" );
            } catch (Exception exc) {
                System.out.println ( "errore" );
            }
        } catch (Exception e) {
            System.out.println ( "errore" );
        }







    }

    static void m1() {
        int[] numbers = {10, 20, 30, 40};

        try {
            System.out.println ( numbers[5] );
        }
        catch ( Exception exc ) {
            System.out.println (" Il messaggio dell'eccezione è: " + exc.getMessage() );
            exc.printStackTrace();
        }
        System.out.println ("here2" );
    }
}
