package shapes;

public class OctagonalPrism extends Shape {

    private double height;
    private double edgeLen;
    private double edgeLenSq;

    public OctagonalPrism(double height, double edgeLen) {
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
        return (2 * (1 + Math.sqrt(2))) * edgeLenSq;
    }

    public @Override
    double getVolume() {
        return getBaseArea() * height;
    }
}
