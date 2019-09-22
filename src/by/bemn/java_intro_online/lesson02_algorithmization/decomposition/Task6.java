package by.bemn.java_intro_online.lesson02_algorithmization.decomposition;

// Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class Task6 {
    public static void main(String[] args) {
        int numberA = 3;
        int numberB = 32;
        int numberC = 11;

        System.out.println(numberA + " " + numberB + " " +numberC);

        if(isSimpleNumbers(numberA, numberB, numberC)) {
            System.out.println("Взаимно простые числа");
        } else {
            System.out.println("не взаимно простые");
        }

    }

    private static int greatestCommonDivisor(int number_a, int number_b) {
        int gcd = 1;
        for (int i = 1; i <= (number_a < number_b ? number_a : number_b); i++) {
            if (number_a % i == 0 && number_b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    private static boolean isSimpleNumbers(int num_1, int num_2, int num_3) {
        if(greatestCommonDivisor(greatestCommonDivisor(num_1, num_2), num_3) == 1) {
            return true;
        }
        return false;
    }
}
