package com.planets;

public class RotacionSentidoHorario extends Rotacion {

    private static final int ORIENTACION_SENTIDO_HORARIO = -1;

    private static final int GRADOS_INICIO = 360;
    private static final int GRADOS_FIN = 0;

    RotacionSentidoHorario() {
        super(GRADOS_INICIO, GRADOS_FIN);
    }

    @Override
    public boolean isCompletoVuelta(int desplazamiento) {
        return ORIENTACION_SENTIDO_HORARIO * (desplazamiento + 1) > getGradosFin();
    }

    @Override
    public int sentidoDeRotacion() {
        return ORIENTACION_SENTIDO_HORARIO;
    }

}
