package com.planets;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Lluvia {
    private Date diaPicoDeLluvia;

    private double cantidad;

    private int cantidadDiaDeLluvia;

    public Lluvia() {
    }

    public void generarPronostico(Planet planetaA, Planet planetaB, Planet planetaC, Date dia) {
        boolean estaLloviendo = PlanetaUtils.estaElSolDentroDelTrianguloFormadoPorLosPlanetas(planetaA, planetaB, planetaC);

        if (estaLloviendo) {
            double cantidadLluvia = PlanetaUtils.getPerimetro(planetaA.getCoordenadas(), planetaB.getCoordenadas(), planetaC.getCoordenadas());
            evaluarCantidadLluvia(dia, cantidadLluvia);
            cantidadDiaDeLluvia++;
        }
    }

    private void evaluarCantidadLluvia(Date date, double cantidad) {
        if (isPicoDeIntensidad(date, cantidad)) {
            definirNuevoPico(date, cantidad);
        }
    }

    private boolean isPicoDeIntensidad(Date dia, double pico) {
        if (dia == null) return true;
        return pico > cantidad ? true : false;
    }

    public void definirNuevoPico(Date dia, double pico) {
        this.diaPicoDeLluvia = dia;
        cantidad = pico;
    }

    public void emitirReporte() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY");
        System.out.println("El pico maximo de lluvia es de " + MathUtils.round(cantidad) + " y fue el dia " + simpleDateFormat.format(diaPicoDeLluvia));
    }

}
