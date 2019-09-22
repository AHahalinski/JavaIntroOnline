package by.bemn.java_intro_online.lesson02_algorithmization.decomposition;

import java.util.Scanner;

// Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
// треугольника.

public class Task3 {
    public static void main(String[] args) {

        int a = initializationNumber("a");
        double area = areaOfFigure(a);

        System.out.println("S = " + area);
    }

    private static double areaOfFigure(int sideOfFigure) {
        return 3 * Math.sqrt(3) * sideOfFigure * sideOfFigure / 2;

    }

    private static int initializationNumber(String nameVariable) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter " + nameVariable + " : ");
        int number = 0;
        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.print("Enter " + nameVariable + " : ");
                scanner.next();
            }

            number = scanner.nextInt();

            if (number <= 0) {
                System.out.print("Enter " + nameVariable + " : ");
            } else {
                break;
            }
        }
        return number;
    }
}
