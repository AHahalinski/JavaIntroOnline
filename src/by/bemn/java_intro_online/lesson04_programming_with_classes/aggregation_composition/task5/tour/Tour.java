package by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task5.tour;

public class Tour {
    private String name;
    private KindTour kindTour;
    private Nutrition nutrition;
    private Transport transport;
    private int days;
    private int cost;

    public Tour(String name, KindTour kindTour, Nutrition nutrition, Transport transport, int days, int cost) {
        this.name = name;
        this.kindTour = kindTour;
        this.nutrition = nutrition;
        this.transport = transport;
        this.days = days;
        this.cost = cost;
    }

    public Tour(KindTour kindTour, Nutrition nutrition, Transport transport, int days) {
        this.kindTour = kindTour;
        this.nutrition = nutrition;
        this.transport = transport;
        this.days = days;
        name = "";
        cost = Integer.MAX_VALUE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KindTour getKindTour() {
        return kindTour;
    }

    public void setKindTour(KindTour kindTour) {
        this.kindTour = kindTour;
    }

    public Nutrition getNutrition() {
        return nutrition;
    }

    public void setNutrition(Nutrition nutrition) {
        this.nutrition = nutrition;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("%-10s%-20s%-8s%-12s%-8d%-8d",
                name, kindTour, nutrition, transport, days,cost);
    }
}
