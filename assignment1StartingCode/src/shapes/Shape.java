package shapes;

public abstract class Shape implements Comparable<Shape> {

    public abstract double getHeight();

    public abstract double getBaseArea();

    public abstract double getVolume();

    public int compareTo(Shape other) {
        return Double.compare(this.getHeight(), other.getHeight());
    }
}
