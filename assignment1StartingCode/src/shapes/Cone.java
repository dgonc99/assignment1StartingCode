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
