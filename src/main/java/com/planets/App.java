package com.planets;

import org.joda.time.DateTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DateTime today = new DateTime();
        DateTime tenYear = today.plusYears(10);

        Planet feringi = new Ferengi();
        Planet betasoide = new Betasoide();
        Planet vulcano = new Vulcano();

        Clima clima = new Clima();
        clima.pronosticarTiempo(tenYear, feringi, vulcano, betasoide);
    }
}
