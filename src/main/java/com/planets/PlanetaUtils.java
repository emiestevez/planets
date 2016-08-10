package com.planets;

public final class PlanetaUtils {

    /* 3 puntos estan alineados si
    * AB + BC = AC
    * d = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2))
    * */
    public static boolean estanAlineados(Coordenadas positionA, Coordenadas positionB, Coordenadas positionC) {
        double dAB = Math.sqrt(Math.pow(positionB.getX() - positionA.getX(), 2) + Math.pow(positionB.getY() - positionA.getY(), 2));
        double dBC = Math.sqrt(Math.pow(positionC.getX() - positionB.getX(), 2) + Math.pow(positionC.getY() - positionB.getY(), 2));
        double dAC = Math.sqrt(Math.pow(positionC.getX() - positionA.getX(), 2) + Math.pow(positionC.getY() - positionA.getY(), 2));

        return MathUtils.round(dAB) + MathUtils.round(dBC) == MathUtils.round(dAC);
    }

    private static double getDistanciaEntrePlanetas(Coordenadas positionA, Coordenadas positionB) {
        return Math.hypot(positionB.getX() - positionA.getX(), positionB.getY() - positionA.getY());
    }

    public static double getPerimetro(Coordenadas positionA, Coordenadas positionB, Coordenadas positionC) {
        double longitudA = getDistanciaEntrePlanetas(positionA, positionB);
        double longitudB = getDistanciaEntrePlanetas(positionB, positionC);
        double longitudC = getDistanciaEntrePlanetas(positionA, positionC);

        return longitudA + longitudB + longitudC;
    }

    public static double orientationTriangule(Coordenadas positionA, Coordenadas positionB, Coordenadas positionC) {
        return ((positionA.getX() - positionC.getX()) * (positionB.getY() - positionC.getY())) -
                ((positionA.getY() - positionC.getY()) * (positionB.getX() - positionC.getX()));
    }

    public static boolean estaElSolDentroDelTrianguloFormadoPorLosPlanetas(Planet planetaA, Planet planetaB, Planet planetaC) {
        Coordenadas sun = new Coordenadas(0, 0);
        Coordenadas positionA = planetaA.getCoordenadas();
        Coordenadas positionB = planetaB.getCoordenadas();
        Coordenadas positionC = planetaC.getCoordenadas();

        double orientationTriangule = PlanetaUtils.orientationTriangule(positionA, positionB, positionC);
        double orientation1 = PlanetaUtils.orientationTriangule(positionA, positionB, sun);
        double orientation2 = PlanetaUtils.orientationTriangule(positionB, positionC, sun);
        double orientation3 = PlanetaUtils.orientationTriangule(positionC, positionA, sun);

        return (Math.signum(orientationTriangule) == Math.signum(orientation1) &&
                Math.signum(orientation1) == Math.signum(orientation2) &&
                Math.signum(orientation1) == Math.signum(orientation3) &&
                Math.signum(orientation2) == Math.signum(orientation3));
    }

}
