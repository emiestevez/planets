package com.planets;

public class Sequia {
    private int diasDeSequia;

    public void pronosticarDeAcuerdoALaPosicionDeLosPlanetas(Planet planetaA, Planet planetaB, Planet planetaC) {
        boolean estanPlanetasAlineados = PlanetaUtils.estanAlineados(planetaA.getCoordenadas(), planetaB.getCoordenadas(), planetaC.getCoordenadas());
        boolean estanPlanetasAlineadosAlSol = PlanetaUtils.estanAlineados(new Coordenadas(0, 0), planetaA.getCoordenadas(), planetaB.getCoordenadas());
        if (estanPlanetasAlineados && estanPlanetasAlineadosAlSol) diasDeSequia++;
    }

    public void emitirReporte(){
        System.out.println("Cantidad de dias de sequia: " + diasDeSequia);
    }
}
