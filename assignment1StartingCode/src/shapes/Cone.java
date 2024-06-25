/* CPRG 304-C
Assignment 1
Team 3 - The Oopsies
Date: 2024-06-20
Basel Chono Campos, Dominic Goncalves, Hoang Nam Nguyen, Rocky Dagalea */

package shapes;

public class Cone extends Shape {

    private double radius;
    private double height;
    private double radiusSq;

    public Cone(double height, double radius) {
        this.radius = radius;
        this.height = height;
        this.radiusSq = radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public @Override
    double getHeight() {
        return height;
    }

    public @Override
    double getBaseArea() {
        return Math.PI * radiusSq;
    }

    public @Override
    double getVolume() {
        return (1.0 / 3.0) * Math.PI * radiusSq * height;
    }
}
