package by.bemn.java_intro_online.algorithmization_02.decomposition;
import java.util.Scanner;

// Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
// действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

public class Task17 {
    public static void main(String[] args) {
        int number = initializationNumber("number");

        int countSubtraction = subtraction(number);

        System.out.println(countSubtraction);
    }

    private static int subtraction(int number) {
        int count = 0;

        do {
            int sumDigit = 0;
            int tempNum = number;
            do{
                sumDigit = sumDigit + tempNum %10;
                tempNum/=10;
            } while (tempNum != 0);

            number = number - sumDigit;
            count++;

        } while(number != 0);

        return count;
    }

    private static int initializationNumber(String nameVariable) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter " + nameVariable + " : ");
        while (!scanner.hasNextInt()) {
            System.out.print("Enter " + nameVariable + " : ");
            scanner.next();
        }
        int number = scanner.nextInt();
        return number;
    }
}
