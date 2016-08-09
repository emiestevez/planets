package com.planets;

public class VelocidadAngular {
    private int grados;

    private int velocidad;

    private Rotacion sentidoRotacion;

    public VelocidadAngular(int velocidad, Rotacion sentidoRotacion) {
        this.velocidad = velocidad;
        this.sentidoRotacion = sentidoRotacion;
        this.grados = velocidad;
    }

    public void avanzar() {
        grados = grados + velocidad * sentidoRotacion.sentidoDeRotacion();
        if (sentidoRotacion.isCompletoVuelta(grados)) {
            grados = obtenerAnguloInicial();
        }
    }

    public double obtenerAngulo() {
        return Radian.convertirGrados(grados);
    }

    private int obtenerAnguloInicial() {
        return sentidoRotacion.getGradosInicio() + this.velocidad * sentidoRotacion.sentidoDeRotacion();
    }

    public Coordenadas getCoordenadasByVelocidadAngular(int distanciaAlSol) {
        Coordenadas coordenadas = new Coordenadas();
        coordenadas.setX(MathUtils.round(distanciaAlSol * Math.cos(grados)));
        coordenadas.setY(MathUtils.round(distanciaAlSol * Math.sin(grados)));
        return coordenadas;
    }

    public static class Builder {
        private int velocidad;

        private Rotacion sentidoRotacion;

        public Builder velocidad(int velocidad) {
            this.velocidad = velocidad;
            return this;
        }

        public Builder sentidoRotacion(Rotacion sentidoRotacion) {
            this.sentidoRotacion = sentidoRotacion;
            return this;
        }

        public VelocidadAngular build() {
            return new VelocidadAngular(velocidad, sentidoRotacion);
        }
    }

    @Override
    public String toString() {
        return "VelocidadAngular{" +
                "grados=" + grados +
                ", velocidad=" + velocidad +
                ", sentidoRotacion=" + sentidoRotacion +
                '}';
    }
}
