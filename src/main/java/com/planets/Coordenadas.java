package com.planets;

public class Coordenadas {

    private double x;

    private double y;

    public Coordenadas(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordenadas() {
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordenadas{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
