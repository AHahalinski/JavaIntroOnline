package by.bemn.java_intro_online.basics_of_software_code_development.loop;

// Найти сумму квадратов первых ста чисел

public class Task3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }

        System.out.println("result : " + sum);
    }
}
