package by.bemn.java_intro_online.algorithmization_02.decomposition;

// Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
// являются цифры числа N.

public class Task10 {
    public static void main(String[] args) {
        int number = 1234567890;

        int[] array = new int[20];
        array = generateArray(array.length, number);

        print(array);
    }

    private static int[] generateArray(int sizeArray, int numberForElements) {
        int countDigits = 1 + (int)Math.floor(Math.log10(numberForElements));

        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            int positionNumber = (int) (Math.random() * countDigits + 1);
            int element = (int) (numberForElements / Math.pow(10, countDigits - positionNumber)) % 10;

            array[i] = element;
        }
        return array;
    }

    private static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + "\t");
        }
    }
}
