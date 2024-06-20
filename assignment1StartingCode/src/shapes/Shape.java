package shapes;

public abstract class Shape implements Comparable<Shape> {

    String type;
    double height;
    double length;
    String x;

    public Shape(String type, double height, double length) {
        this.type = type;
        this.height = height;
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public double getHeight() {
        return height;
    }
    

    public double getLength() {
        return length;
    }

    public int compareTo(Shape s) {
        return Double.compare(this.height, s.height);
    }
}
