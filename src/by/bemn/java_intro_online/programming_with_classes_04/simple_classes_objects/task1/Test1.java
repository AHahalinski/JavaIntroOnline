package by.bemn.java_intro_online.programming_with_classes_04.simple_classes_objects.task1;

/*
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
 * переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
 * наибольшее значение из этих двух переменных.
 */

public class Test1 {
    private int var1 = 11;
    private int var2 = 21;

    public void printVar() {
        System.out.println(var1 + "\n" + var2);
    }

    public void setVar1(int num) {
        var1 = num;
    }

    public void setVar2(int num) {
        var2 = num;
    }

    public int getSum() {
        return var1 + var2;
    }

    public int getMax() {
        return var1 > var2 ? var1 : var2;
    }
}
