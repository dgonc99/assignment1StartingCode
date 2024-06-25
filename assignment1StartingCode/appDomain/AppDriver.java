/* CPRG 304-C
Assignment 1
Team 3 - The Oopsies
Date: 2024-06-20
Basel Chono Campos, Dominic Goncalves, Hoang Nam Nguyen, Rocky Dagalea */

package appDomain;

import shapes.Shape;
import shapes.Cone;
import shapes.Cylinder;
import shapes.OctagonalPrism;
import shapes.PentagonalPrism;
import shapes.Pyramid;
import shapes.SquarePrism;
import shapes.TriangularPrism;
import sorting.SortingAlgorithms;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class AppDriver {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java -jar Sort.jar -f<file_name> -t<sort_type> -s<sort_algorithm>");
            return;
        }

        String fileName = null;
        char sortType = 'h';
        char sortAlgorithm = 'b';

        for (String arg : args) {
            if (arg.startsWith("-f")) {
                fileName = arg.substring(2);
            } else if (arg.startsWith("-t")) {
                sortType = arg.charAt(2);
            } else if (arg.startsWith("-s")) {
                sortAlgorithm = arg.charAt(2);
            }
        }

        if (fileName == null) {
            System.out.println("File name is required.");
            return;
        }

        Shape[] shapes = readShapesFromFile(fileName);

        if (shapes == null) {
            System.out.println("Error reading shapes from file.");
            return;
        }

        long startTime = System.currentTimeMillis();

        switch (sortAlgorithm) {
            case 'b':
                SortingAlgorithms.bubbleSort(shapes);
                break;
            case 's':
                SortingAlgorithms.selectionSort(shapes);
                break;
            case 'i':
                SortingAlgorithms.insertionSort(shapes);
                break;
            case 'm':
                SortingAlgorithms.mergeSort(shapes);
                break;
            case 'q':
                SortingAlgorithms.quickSort(shapes);
                break;
            case 'h': // Assuming 'h' for Heap Sort as custom choice
                SortingAlgorithms.heapSort(shapes);
                break;
            default:
                System.out.println("Unknown sorting algorithm.");
                return;
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Sorting took " + (endTime - startTime) + " milliseconds.");

        printSortedShapes(shapes);
    }

    private static Shape[] readShapesFromFile(String fileName) {
        List<Shape> shapeList = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(fileName))) {
            int numberOfShapes = scanner.nextInt(); // Read the number of shapes
            scanner.nextLine(); // Move to the next line after reading the number

            for (int i = 0; i < numberOfShapes; i++) {
                if (scanner.hasNextLine()) {
                    String shapeLine = scanner.nextLine();
                    String[] shapeData = shapeLine.split(" ");
                    String shapeType = shapeData[0];

                    switch (shapeType) {
                        case "Cylinder":
                            double cylinderHeight = Double.parseDouble(shapeData[1]);
                            double cylinderRadius = Double.parseDouble(shapeData[2]);
                            shapeList.add(new Cylinder(cylinderHeight, cylinderRadius));
                            break;
                        case "Cone":
                            double coneHeight = Double.parseDouble(shapeData[1]);
                            double coneRadius = Double.parseDouble(shapeData[2]);
                            shapeList.add(new Cone(coneHeight, coneRadius));
                            break;
                        case "Pyramid":
                            double pyramidHeight = Double.parseDouble(shapeData[1]);
                            double pyramidEdgeLength = Double.parseDouble(shapeData[2]);
                            shapeList.add(new Pyramid(pyramidHeight, pyramidEdgeLength));
                            break;
                        case "SquarePrism":
                            double squarePrismHeight = Double.parseDouble(shapeData[1]);
                            double squarePrismEdgeLength = Double.parseDouble(shapeData[2]);
                            shapeList.add(new SquarePrism(squarePrismHeight, squarePrismEdgeLength));
                            break;
                        case "TriangularPrism":
                            double triangularPrismHeight = Double.parseDouble(shapeData[1]);
                            double triangularPrismEdgeLength = Double.parseDouble(shapeData[2]);
                            shapeList.add(new TriangularPrism(triangularPrismHeight, triangularPrismEdgeLength));
                            break;
                        case "PentagonalPrism":
                            double pentagonalPrismHeight = Double.parseDouble(shapeData[1]);
                            double pentagonalPrismEdgeLength = Double.parseDouble(shapeData[2]);
                            shapeList.add(new PentagonalPrism(pentagonalPrismHeight, pentagonalPrismEdgeLength));
                            break;
                        case "OctagonalPrism":
                            double octagonalPrismHeight = Double.parseDouble(shapeData[1]);
                            double octagonalPrismEdgeLength = Double.parseDouble(shapeData[2]);
                            shapeList.add(new OctagonalPrism(octagonalPrismHeight, octagonalPrismEdgeLength));
                            break;
                        default:
                            System.out.println("Unknown shape type: " + shapeType);
                            break;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            e.printStackTrace();
        }

        return shapeList.toArray(new Shape[0]);
    }

    private static void printSortedShapes(Shape[] shapes) {
        if (shapes.length > 0) {
            System.out.println("First Shape: " + shapes[0]);
            for (int i = 1000; i < shapes.length; i += 1000) {
                System.out.println("Shape at index " + i + ": " + shapes[i]);
            }
            System.out.println("Last Shape: " + shapes[shapes.length - 1]);
        }
    }
}
