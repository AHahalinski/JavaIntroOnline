package by.bemn.java_intro_online.lesson01_basics_of_software_code_development.loop;

import java.math.BigInteger;

// Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task4 {
    public static void main(String[] args) {
        BigInteger mult = new BigInteger("1");
        for (int i = 1; i <= 200; i++) {
            mult = mult.multiply(new BigInteger(String.valueOf(i*i)));
        }

        System.out.println("result : " + mult);
    }
}
