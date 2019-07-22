package by.bemn.java_intro_online.algorithmization_02.sorting;

import java.util.Scanner;

// Пусть даны две неубывающие последовательности действительных чисел a1 < a2 < ... < an и b1 < b2 < ... < bm .
// Требуется указать те места, на которые нужно вставлять элементы последовательности b1 < b2 < ... < bm в первую
// последовательность так, чтобы новая последовательность оставалась возрастающей

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array_1  n : ");
        while (!scanner.hasNextInt()) {
            System.out.print("Enter size of array_1  n : ");
            scanner.next();
        }
        int sizeA = scanner.nextInt();

        System.out.print("Enter size of array_2  m : ");
        while (!scanner.hasNextInt()) {
            System.out.print("Enter size of array_2  m : ");
            scanner.next();
        }
        int sizeB = scanner.nextInt();

        int[] a = generateArray(sizeA);
        int[] b = generateArray(sizeB);

        System.out.print("a [ ");
        print(a);
        System.out.println("]");

        System.out.print("b [ ");
        print(b);
        System.out.println("]");

        int indexA = 0;
        int indexB = 0;

        for (; indexA < a.length || indexB < b.length;) {

            if(indexA < a.length && indexB < b.length) {

                if (a[indexA] > b[indexB]) {
                    System.out.print("b[" + indexB +"] ");
                    if (indexB < b.length) {
                        indexB++;
                    }
                } else {
                    System.out.print("a["+ indexA +"] ");
                    if (indexA < a.length) {
                        indexA++;
                    }
                }

            }else if(indexB < b.length){
                    System.out.print("b[" + indexB + "] ");
                    indexB++;
            }else {
                System.out.print("a[" + indexA + "] ");
                indexA++;
            }
        }
    }

    private static int[] generateArray(int sizeArray) {
        int[] array = new int[sizeArray];
        array[0] = (int) (Math.random() * 100)/sizeArray;
        for (int i = 1; i < sizeArray; i++) {
            while (true) {
                array[i] = (int) (Math.random() * 100*sizeArray)/(sizeArray-i);
                if(array[i] > array[i-1]) {
                    break;
                }
            }
        }
        return array;
    }

    private static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + "\t");
        }
    }
}

