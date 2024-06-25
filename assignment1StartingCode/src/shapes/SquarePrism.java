package shapes;

public class SquarePrism extends Shape {

    private double height;
    private double edgeLen;
    private double edgeLenSq;

    public SquarePrism(double height, double edgeLen) {
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
        return edgeLenSq;
    }

    public @Override
    double getVolume() {
        return edgeLenSq * height;
    }
}
