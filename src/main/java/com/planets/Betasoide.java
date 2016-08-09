package com.planets;

public class Betasoide extends Planet {

    public static final int VELOCIDAD_ANGULAR = 3;
    public static final int DISTANCIA_AL_SOL = 2000;

    public Betasoide() {
        super(DISTANCIA_AL_SOL, VELOCIDAD_ANGULAR, new RotacionSentidoHorario());
    }




}
