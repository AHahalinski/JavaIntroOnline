package by.bemn.java_intro_online.algorithmization_02.sorting;

public class Task8 {
    public static void main(String[] args) {
        int[] p = {1, 9, 8, 5, 12, 5, 22, 11, 1, 3, 8};
//        int[] q = {2, 8, 10, 8, 7, 12, 1, 6, 3, 5, 5};
        int[] q = {2, 1, 4, 8, 1, 2, 2, 2, 4, 8, 8};
//        int[] q = {1, 8, 4, 8, 5, 2, 10, 2, 4, 10, 40};

        System.out.println("Fraction:");
        printFraction(p, q);

        int denominator = findDenominator(q);
        reductionFraction(p, q, denominator);

        System.out.println("\nFraction after find NOK:");
        printFraction(p, q);

        sortFraction(p);

        System.out.println("\nFraction after sorting:");
        printFraction(p, q);

    }

    private static void sortFraction(int[] p) {
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length - 1 - i; j++) {
                if (p[j] > p[j + 1]) {
                    int temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }
            }
        }
    }

    private static void reductionFraction(int[] p, int[] q, int denominator) {
        for (int i = 0; i < p.length; i++) {
            p[i] = p[i] * (denominator / q[i]);
            q[i] = denominator;
        }
    }

    private static int findDenominator(int[] q) {
        int nok = 1;
        int tempNOK = 1;

        for (int i = 0; i < q.length; i++) {
            if (q[i] > tempNOK) {
                tempNOK = q[i];
            }
        }

        boolean isDenFind = false;
        int factor = 1;
        while (!isDenFind) {
            isDenFind = true;
            nok = factor * tempNOK;
            for (int i = 0; i < q.length; i++) {
                if (nok % q[i] != 0) {
                    factor++;
                    isDenFind = false;
                    break;
                }
            }
        }
        return nok;
    }

    private static void printFraction(int[] p, int[] q) {
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i] + "/" + q[i]);
            if (i < p.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
