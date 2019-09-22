package by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task2;

public class Wheel {
    private LocationWheel nameLocation;
    private boolean isSpin;

    public Wheel(LocationWheel nameLocation) {
        this.nameLocation = nameLocation;
        isSpin = false;
    }

    public LocationWheel getNameLocation() {
        return nameLocation;
    }

    public void setNameLocation(LocationWheel nameLocation) {
        this.nameLocation = nameLocation;
    }

    public boolean isSpin() {
        return isSpin;
    }

    public void startSpinning(){
        isSpin = true;
        System.out.println("Wheel " + nameLocation.toString() + " is spinning");
    }

    public void stopSpinning() {
        isSpin = false;
        System.out.println("Wheel " + nameLocation.toString() + " stopped");
    }

    public void getStatus(){
        System.out.println("Wheel " + nameLocation + " " + (isSpin() ? "is spinning" : "isn't spinning"));
    }
}
