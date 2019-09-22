package by.bemn.java_intro_online.lesson04_programming_with_classes.simple_classes_objects.task7;

import java.awt.*;

/*
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
 * площади, периметра и точки пересечения медиан.
 */

public class Triangle {
    private Point a = new Point(0, 0);
    private Point b = new Point(0, 0);
    private Point c = new Point(0, 0);

    public Triangle() {
    }

    private Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static Triangle getInstants(Point a, Point b, Point c) {
        double sideAB = getLengthSide(a, b);
        double sideBC = getLengthSide(b, c);
        double sideCA = getLengthSide(c, a);

        if ((c.x - a.x) * (b.y - a.y) == (c.y - a.y) * (b.x - a.x)
                || (sideAB + sideBC < sideCA)
                || (sideBC + sideCA < sideAB)
                || (sideCA + sideAB < sideBC)) {
            System.out.println("Triangle isn't exist");
        } else {
            return new Triangle(a, b, c);
        }
        return null;
    }

    public double getPerimeter() {
        return getLengthSide(a, b) + getLengthSide(b, c) + getLengthSide(c, a);
    }

    public double getArea() {
        double sideAB = getLengthSide(a, b);
        double sideBC = getLengthSide(b, c);
        double sideCA = getLengthSide(c, a);

        double p = (sideAB + sideBC + sideCA) / 2;

        double s = Math.sqrt(p * (p - sideAB) * (p - sideBC) * (p - sideCA));
        return s;
    }

    public double[] getPointOfCrossMedians() {
        double x = (a.x + b.x + c.x) / 3d;
        double y = (a.y + b.y + c.y) / 3d;

        return new double[]{x, y};
    }

    private static double getLengthSide(Point a, Point b) {
        return Math.sqrt(Math.pow((a.x - b.x), 2) + Math.pow((a.y - b.y), 2));
    }

    @Override
    public String toString() {
        return String.format("Triangle with points a=[%d; %d], b==[%d; %d], c=[%d; %d]",
                a.x, a.y, b.x, b.y, c.x, c.y);
    }
}
