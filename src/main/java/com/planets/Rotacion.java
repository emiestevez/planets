package com.planets;

public abstract class Rotacion {
    private final int gradosInicio;

    private final int gradosFin;

    Rotacion(int gradosInicio, int gradosFin) {
        this.gradosInicio = gradosInicio;
        this.gradosFin = gradosFin;
    }

    public abstract boolean isCompletoVuelta(int desplazamiento);

    public abstract int sentidoDeRotacion();

    public int getGradosInicio() {
        return gradosInicio;
    }

    public int getGradosFin() {
        return gradosFin;
    }
}
