package it.Adiener.core.lib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Librator {
    private static final Logger logger = LoggerFactory.getLogger ( Librator.class );

    public static void main ( String[] args ) {
        logger.debug ("ciao sono un messaggio");
        logger.info ("ciao sono un messaggio");
        logger.error ("ciao sono un messaggio");
    }
}
