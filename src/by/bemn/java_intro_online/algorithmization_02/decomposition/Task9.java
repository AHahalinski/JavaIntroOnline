package by.bemn.java_intro_online.algorithmization_02.decomposition;

//  Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
// если угол между сторонами длиной X и Y— прямой.

public class Task9 {
    public static void main(String[] args) {
        int X = 2;
        int Y = 5;
        int Z = 2;
        int T = 5;
        double angleXY = Math.PI / 2;

        double angleZT = angle(X, Y, Z, T, angleXY);

        if (angleZT > 0 && angleZT <= Math.PI) {
            double square = squareOfFigure(X, Y, Z, T, angleXY, angleZT);
            System.out.printf("Square figure with sides X = %s, Y = %s, Z = %s, T = %s is  %s",
                    X, Y, Z, T, square);
        } else {
            System.out.printf("Figure with sides X = %s, Y = %s, Z = %s, T = %s not exist", X, Y, Z, T);
        }
    }

    private static double squareOfFigure(int x, int y, int z, int t, double angleXY, double angleZT) {
        double p = halfPerimeter(x, y, z, t);
        double s = Math.sqrt((p - x) * (p - y) * (p - z) * (p - t)
                - x * y * z * t * Math.pow(Math.cos((angleXY + angleZT) / 2), 2));
        return s;
    }

    private static double angle(int side1, int side2, int side3, int side4, double angleSide1_Side2) {
        double tempDiagonal = Math.sqrt(side1 * side1 + side2 * side2);
        return Math.acos((side3 * side3 + side4 * side4 - tempDiagonal * tempDiagonal) / (2 * side3 * side4));
    }

    private static double halfPerimeter(int side1, int side2, int side3, int side4) {
        return (side1 + side2 + side3 + side4) / 2d;
    }

}
