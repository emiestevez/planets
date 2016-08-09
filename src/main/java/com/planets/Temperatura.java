package com.planets;

public class Temperatura {
    private int diasDePresionYTemperaturaOptimas;

    public void isPresionYTemperaturaOptima(Planet planetaA, Planet planetaB, Planet planetaC) {
        boolean estanPlanetasAlineados = PlanetaUtils.estanAlineados(planetaA.getCoordenadas(), planetaB.getCoordenadas(), planetaC.getCoordenadas());
        boolean estanPlanetasAlineadosAlSol = PlanetaUtils.estanAlineados(new Coordenadas(0, 0), planetaA.getCoordenadas(), planetaB.getCoordenadas());
        if (estanPlanetasAlineados && !estanPlanetasAlineadosAlSol) diasDePresionYTemperaturaOptimas++;
    }

    public void emitirReporte() {
        System.out.println("Cantidad de periodos de presion y temperatura optimas: " + diasDePresionYTemperaturaOptimas);
    }

    @Override
    public String toString() {
        return "Temperatura{" +
                "diasDePresionYTemperaturaOptimas=" + diasDePresionYTemperaturaOptimas +
                '}';
    }
}
