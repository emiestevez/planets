package com.planets;

public class Vulcano extends Planet {

    public static final int VELOCIDAD_ANGULAR = 5;
    public static final int DISTANCIA_AL_SOL = 1000;

    public Vulcano() {
        super(DISTANCIA_AL_SOL, VELOCIDAD_ANGULAR, new RotacionSentidoContrarioHorario());
    }




}
