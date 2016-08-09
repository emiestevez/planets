package com.planets;

import java.math.BigDecimal;

public abstract class Planet {

    private int distanciaAlSol;

    private Rotacion sentidoDeRotacion;

    private Coordenadas coordenadas;

    private int desplazamiento;

    private VelocidadAngular velocidadAngular;

    public Planet(int distanciaAlSol, int velocidadAngular, Rotacion orientation) {
        this.distanciaAlSol = distanciaAlSol;
        this.sentidoDeRotacion = orientation;
        this.velocidadAngular = new VelocidadAngular.Builder().velocidad(velocidadAngular).sentidoRotacion(orientation).build();
        this.coordenadas = this.velocidadAngular.getCoordenadasByVelocidadAngular(distanciaAlSol);
        //this.coordenadas = new Coordenadas(distanciaAlSol, 0);
        this.desplazamiento = 0;
    }

    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

    public void desplazar() {
        double angulo = getVelocidadAngular().obtenerAngulo();
        this.getCoordenadas().setX(round(distanciaAlSol * Math.cos(angulo)));
        this.getCoordenadas().setY(round(distanciaAlSol * Math.sin(angulo)));
        getVelocidadAngular().avanzar();
    }

    public VelocidadAngular getVelocidadAngular() {
        return velocidadAngular;
    }

    protected double round(double val) {
        return new BigDecimal(String.valueOf(val)).setScale(2, BigDecimal.ROUND_UP).doubleValue();
    }

    @Override
    public String toString() {
        return "Planet{" +
                "distanciaAlSol=" + distanciaAlSol +
                ", sentidoDeRotacion=" + sentidoDeRotacion +
                ", coordenadas=" + coordenadas +
                ", desplazamiento=" + desplazamiento +
                ", velocidadAngular=" + velocidadAngular +
                '}';
    }

}
