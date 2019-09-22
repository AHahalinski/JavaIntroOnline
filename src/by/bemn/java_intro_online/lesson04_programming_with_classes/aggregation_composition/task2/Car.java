package by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task2;

import java.util.Arrays;

public class Car {
    private String nameModel;
    private Engine engine;
    private Wheel[] wheels;
    private double litersOfFuel;
    private final static double FUEL_MAX = 63.0;

    public Car(String nameModel, Engine engine, Wheel[] wheels) {
        this.nameModel = nameModel;
        this.engine = engine;
        this.wheels = wheels;
        litersOfFuel = 20.0;
    }

    public Car(String nameModel, Engine engine, Wheel[] wheels, double literOfFuel) {
        this.nameModel = nameModel;
        this.engine = engine;
        this.wheels = wheels;
        this.litersOfFuel = literOfFuel;
    }

    public void go() {
        if(litersOfFuel > 0) {
            engine.startEngine();
            Arrays.stream(wheels).forEach(wheel -> wheel.startSpinning());
            System.out.println("Car started moving");
        } else {
            System.out.println("Fuel is empty, car can't move");
        }
    }

    public void stop(){
        engine.stoppingEngine();
        Arrays.stream(wheels).forEach(wheel -> wheel.stopSpinning());
        System.out.println("Car stopped");
    }

    public void addFuel(int fuel) {
        if(engine.isWorking()) {
            stop();
        }

        if(fuel+litersOfFuel <= FUEL_MAX) {
            litersOfFuel+=fuel;
        } else {
            litersOfFuel = FUEL_MAX;
        }
        System.out.println("The car is fueled");
    }

    public void changeWheel(LocationWheel locationWheel) {
        if(engine.isWorking()) {
            stop();
        }
        Arrays.stream(wheels).forEach(wheel -> {
            if (wheel.getNameLocation() == locationWheel) {
                wheel = new Wheel(locationWheel);
            }
        });
        System.out.println("Wheel " + locationWheel.toString() + " was change");

    }

    public void getNameModel() {
        System.out.println(nameModel);
    }

    public void getFullInformationAboutCar(){
        System.out.println("Information about car" +
                "\n==========================");
        System.out.println(nameModel);
        System.out.println("engine " + (engine.isWorking() ? " is working" : "isn't working"));
        System.out.println("fuel = " + litersOfFuel);
        Arrays.stream(wheels).forEach(wheel -> wheel.getStatus());
        System.out.println("==========================");
    }
}
