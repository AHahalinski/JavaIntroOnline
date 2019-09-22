package by.bemn.java_intro_online.lesson02_algorithmization.decomposition;

// Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
// Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
// решения задачи использовать декомпозицию.

public class Task13 {
    public static void main(String[] args) {
        int beginNumber = 40;
        findAndPrintTwinsNumbers(beginNumber);
    }

    private static void findAndPrintTwinsNumbers(int beginNumber) {
        for (int i = beginNumber; i < 2 * beginNumber - 2; i++) {
            if (isSimpleNumber(i) && isSimpleNumber(i+2)) {
                System.out.println(i + " and " + (i+2));
            }
        }
    }

    private static boolean isSimpleNumber(int number) {
        if(number <= 2) {       // исключаем 2 по условию задачи
            return false;
        }
        for (int j = 2; j < number; j++) {
            if(number%j == 0) {
                return false;
            }
        }
        return true;
    }
}
