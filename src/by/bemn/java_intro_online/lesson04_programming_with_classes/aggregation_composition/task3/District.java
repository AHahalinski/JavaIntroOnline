package by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task3;

import java.util.StringJoiner;

public class District {
    private String name;
    private City capitalOfDistrict;
    private double area;

    public District(String nameDistrict, City capitalOfDistrict, double area) {
        this.name = nameDistrict;
        this.capitalOfDistrict = capitalOfDistrict;
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public City getCapitalOfDistrict(){
        return capitalOfDistrict;
    }

    @Override
    public String toString() {
        return new StringJoiner("  ")
                .add("District: '" + name + "'")
                .add("\ncapitalOfDistrict: " + capitalOfDistrict)
                .add("\narea: " + area + "\n")
                .toString();
    }
}
