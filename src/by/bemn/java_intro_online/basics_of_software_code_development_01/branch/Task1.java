package by.bemn.java_intro_online.basics_of_software_code_development_01.branch;

import java.util.Scanner;

// даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да,
// то будет ли от прямоугольным.

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter angle value \"angle1\" = ");
        int angle1 = scanner.nextInt();
        System.out.print("Enter angle value \"angle2\" = ");
        int angle2 = scanner.nextInt();

        if (angle1 + angle2 <= 180) {
            System.out.println("It's a triangle");
            if (180 - angle1 - angle2 == 90) {
                System.out.println("rectangular");
            } else {
                System.out.println("not rectangular");
            }
        } else {
            System.out.println("It isn't a triangle");
        }
    }
}
