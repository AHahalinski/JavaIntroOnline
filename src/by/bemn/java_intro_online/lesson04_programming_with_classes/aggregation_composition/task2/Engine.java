package by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task2;

public class Engine {
    private static int id;
    private boolean isWorking;

    public Engine() {
        isWorking = false;
        id++;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public void startEngine(){
        isWorking = true;
        System.out.println("Engine is working");
    }

    public void stoppingEngine(){
        isWorking = false;
        System.out.println("Engine is stopping");
    }
}
