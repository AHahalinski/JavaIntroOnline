package by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task2;

/*
 *  Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 *  менять колесо, вывести на консоль марку автомобиля.
 */

public class Main {
    public static void main(String[] args) {
        Wheel[] wheels = {
                new Wheel(LocationWheel.FL),
                new Wheel(LocationWheel.FR),
                new Wheel(LocationWheel.RL),
                new Wheel(LocationWheel.RR),
        };

        Engine engine = new Engine();

        Car car = new Car("Ford Focus", engine, wheels);

        System.out.println("\ninformation :");
        car.getFullInformationAboutCar();

        car.addFuel(30);

        System.out.println("\ninformation :");
        car.getFullInformationAboutCar();

        System.out.println("\ncar go :");
        car.go();

        car.addFuel(15);

        System.out.println("\ninformation :");
        car.getFullInformationAboutCar();

        System.out.println("\nchange wheel:");
        car.changeWheel(LocationWheel.FR);

        System.out.println("\ninformation :");
        car.getFullInformationAboutCar();
        car.getNameModel();
    }

}
