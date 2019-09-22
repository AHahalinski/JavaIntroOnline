package by.bemn.java_intro_online.lesson04_programming_with_classes.simple_classes_objects.task7;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = Triangle.getInstants(new Point(0, 0), new Point(1,1), new Point(3, 3));
        Triangle triangle1 = Triangle.getInstants(new Point(0, 0), new Point(0,3), new Point(4, 0));
        System.out.println(triangle1);

        System.out.println("Area is " + triangle1.getArea());
        System.out.println("Perimeter is " + triangle1.getPerimeter());

        double[] pointCrossMedians = triangle1.getPointOfCrossMedians();
        System.out.printf("Point of cross medians is [%f; %f]", pointCrossMedians[0], pointCrossMedians[1]);
    }
}
