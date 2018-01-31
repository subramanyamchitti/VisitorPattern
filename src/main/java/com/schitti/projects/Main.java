package com.schitti.projects;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    public static void main(String[] args) {
        List<IShape> shapes = getRandomShapes();
        System.out.println("Input Shapes = " + shapes);

        AreaVisitor areaComputer = new AreaVisitor();
        Function<IShape, Double> computeAreas = (IShape s) -> areaComputer.apply(s);
        List<Double> areas = shapes.stream().map(computeAreas).collect(Collectors.toList());

        System.out.println("Computed Areas = " + areas);
    }

    private static double getRandomInt() {
        // Return a random integer between 5 and 20 inclusive
        return ThreadLocalRandom.current().nextInt(5, 21);
    }

    private static Rectangle getRandomRectangle() {
        return new Rectangle(getRandomInt(), getRandomInt());
    }

    private static Triangle getRandomTriangle() {
        return new Triangle(getRandomInt(), getRandomInt());
    }

    private static Circle getRandomCircle() {
        return new Circle(getRandomInt());
    }

    private static IShape getRandomShape() {
        IShape shape = getRandomCircle();
        int type = ThreadLocalRandom.current().nextInt(1, 4);
        switch (type) {
            case 1:
                shape = getRandomRectangle();
            break;
            case 2:
                shape = getRandomTriangle();
            break;
            case 3:
                shape = getRandomCircle();
            break;

        }
        return shape;
    }

    private static List<IShape> getRandomShapes() {
        List<IShape> shapes = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            shapes.add(getRandomShape());
        }
        return shapes;
    }

}

