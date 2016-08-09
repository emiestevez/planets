package com.planets;

public class RotacionSentidoContrarioHorario extends Rotacion {

    private static final int ORIENTACION_SENTIDO_CONTRARIO_HORARIO = 1;

    private static final int GRADOS_INICIO = 0;
    private static final int GRADOS_FIN = 360;


    RotacionSentidoContrarioHorario() {
        super(GRADOS_INICIO, GRADOS_FIN);
    }

    @Override
    public boolean isCompletoVuelta(int desplazamiento) {
        return ORIENTACION_SENTIDO_CONTRARIO_HORARIO * (desplazamiento + 1) > getGradosFin();
    }

    @Override
    public int sentidoDeRotacion() {
        return ORIENTACION_SENTIDO_CONTRARIO_HORARIO;
    }
}
