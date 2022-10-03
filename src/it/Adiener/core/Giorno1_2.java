package it.Adiener.core;

public class Giorno1_2 {

    public static void main ( String[] args ) {
        int x = 10;
        int y = 0;

        try {
            if ( y > 0 ) {
                System.out.println ( x / y );
            } else {
                DivisionByNegativeException exc = new DivisionByNegativeException ( " le divisioni non accettano 0" +
                        " come dovisore" );
                System.out.println ( exc.getExcGenerated () );
                throw exc;
            }
        } catch (DivisionByNegativeException exc) {
            System.out.println ( exc );
        } finally {
            System.out.println ( "finally eseguito" );
        }




    }



}
class DivisionByNegativeException extends ArithmeticException {
    private static int excGenerated = 0;
    public DivisionByNegativeException ( String message ) {
        super(message);
    }

    public int getExcGenerated() {
        return excGenerated;
    }
}

class EpicodeException extends Exception {

    public EpicodeException ( String message ) {
        super(message);
    }
}