package by.bemn.java_intro_online.lesson02_algorithmization.decomposition;

// Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task7 {
    public static void main(String[] args) {
        int sum = sumFactorial();

        System.out.println(sum);
    }

    private static int sumFactorial() {
        int sum = 0;
        for (int i = 1; i <=9 ; i++) {
            if(i%2 != 0) {
                sum = sum + factorial(i);
            }
        }
        return sum;
    }

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
