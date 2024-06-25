/* CPRG 304-C
Assignment 1
Team 3 - The Oopsies
Date: 2024-06-20
Basel Chono Campos, Dominic Goncalves, Hoang Nam Nguyen, Rocky Dagalea */

package shapes;

public class TriangularPrism extends Shape {

    private double height;
    private double edgeLen;
    private double edgeLenSq;

    public TriangularPrism(double height, double edgeLen) {
        this.height = height;
        this.edgeLen = edgeLen;
        this.edgeLenSq = edgeLen * edgeLen;
    }

    public double getEdgeLen() {
        return edgeLen;
    }

    public @Override
    double getHeight() {
        return height;
    }

    public @Override
    double getBaseArea() {
        return (edgeLenSq * Math.sqrt(3)) / 4;
    }

    public @Override
    double getVolume() {
        return getBaseArea() * height;
    }
}
