package by.bemn.java_intro_online.algorithmization_02.decomposition;

import java.util.Scanner;

// На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
// из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.

public class Task4 {
    public static void main(String[] args) {

        // Массив точек (координат точек) будет иметь следующий вид масивТочек[точка№...][Х, У]
        int[][] points = {
                {1, -5},          // 1-ая точка с координатами x=1, y=0
                {1, 1},          // 2-ая точка
                {2, 2},
                {-3, -2},
                {4, 1},
                {4, 1},
                {-3, 1}           // N-ая точка
        };

        int[] pointsMaxDistans = findMaxDistans(points);

        for (int point : pointsMaxDistans) {
            System.out.printf("Point # %s (%s, %s)\n", (point + 1), points[point][0], points[point][1]);
        }
    }

    private static int[] findMaxDistans(int[][] points) {
        double maxDistans = 0;
        int point_1 = 0;
        int point_2 = 0;

        for (int i = 0; i < points.length - 1; i++) {

            for (int j = i + 1; j < points.length; j++) {
                double tempDistans = distansTwoPoints(points[i], points[j]);

                if (tempDistans > maxDistans) {
                    point_1 = i;
                    point_2 = j;
                    maxDistans = tempDistans;
                }
            }
        }

        int[] pointsMaxDistans = {point_1, point_2};

        return pointsMaxDistans;
    }

    private static double distansTwoPoints(int[] point_1, int[] point_2) {
        double dis = Math.sqrt(Math.pow((point_2[0] - point_1[0]), 2) + Math.pow((point_2[1] - point_1[1]), 2));
        return dis;
    }
}
