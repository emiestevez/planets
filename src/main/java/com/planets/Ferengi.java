package com.planets;

public class Ferengi extends Planet {

    public static final int VELOCIDAD_ANGULAR = 1;
    public static final int DISTANCIA_AL_SOL = 500;

    public Ferengi() {
        super(DISTANCIA_AL_SOL, VELOCIDAD_ANGULAR, new RotacionSentidoHorario());
    }




}
