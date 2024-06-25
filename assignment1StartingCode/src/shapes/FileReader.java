package shapes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    public static Shape[] readShapesFromFile(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filename));
        int shapeLen = sc.nextInt();
        Shape[] shapes = new Shape[shapeLen];

        int index = 0;
        while (sc.hasNext()) {
            String shapeType = sc.next();
            double height = sc.nextDouble();
            double val2 = sc.nextDouble();

            switch (shapeType) {
                case "Cone":
                    shapes[index] = new Cone(height, val2);
                    break;
                case "Cylinder":
                    shapes[index] = new Cylinder(height, val2);
                    break;
                case "OctagonalPrism":
                    shapes[index] = new OctagonalPrism(height, val2);
                    break;
                case "PentagonalPrism":
                    shapes[index] = new PentagonalPrism(height, val2);
                    break;
                case "Pyramid":
                    shapes[index] = new Pyramid(height, val2);
                    break;
                case "SquarePrism":
                    shapes[index] = new SquarePrism(height, val2);
                    break;
                case "TriangularPrism":
                    shapes[index] = new TriangularPrism(height, val2);
                    break;
                default:
                    break;
            }
            index++;
        }
        sc.close();
        return shapes;
    }
}
