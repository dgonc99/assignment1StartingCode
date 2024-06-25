package shapes;

public class PentagonalPrism extends Shape {

    private double height;
    private double edgeLen;
    private double edgeLenSq;

    public PentagonalPrism(double height, double edgeLen) {
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
        return (5 * edgeLenSq * Math.tan(54)) / 4;
    }

    public @Override
    double getVolume() {
        return getBaseArea() * height;
    }
}
