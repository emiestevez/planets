package com.planets;

import org.joda.time.DateTime;

public class Clima {

    private Lluvia lluvia;
    private Sequia sequia;
    private Temperatura temperatura;

    public Clima() {
        lluvia = new Lluvia();
        sequia = new Sequia();
        temperatura = new Temperatura();
    }

    public void pronosticarTiempo(DateTime fechaMaximaPronostico, Planet planetaA, Planet planetaB, Planet planetaC) {
        DateTime hoy = new DateTime();

        while (!hoy.isAfter(fechaMaximaPronostico)) {
            sequia.generarPronostico(planetaA, planetaB, planetaC);
            temperatura.generarPronostico(planetaA, planetaB, planetaC);
            lluvia.generarPronostico(planetaA, planetaB, planetaC, hoy.toDate());

            planetaA.desplazar();
            planetaC.desplazar();
            planetaB.desplazar();

            hoy = hoy.plusDays(1);
        }

        sequia.emitirReporte();
        temperatura.emitirReporte();
        lluvia.emitirReporte();
    }
}
