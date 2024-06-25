/* CPRG 304-C
Assignment 1
Team 3 - The Oopsies
Date: 2024-06-20
Basel Chono Campos, Dominic Goncalves, Hoang Nam Nguyen, Rocky Dagalea */

package shapes;

public abstract class Shape implements Comparable<Shape> {

    public abstract double getHeight();

    public abstract double getBaseArea();

    public abstract double getVolume();

    public int compareTo(Shape other) {
        return Double.compare(this.getHeight(), other.getHeight());
    }
}
