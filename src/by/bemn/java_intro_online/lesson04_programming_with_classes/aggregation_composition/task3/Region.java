package by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task3;

import java.util.Arrays;

public class Region {
    private String name;
    private District[] districts;
    private City capitalOfRegion;
    private double area;

    public Region(String name, City capitalOfRegion, District... districts) {
        this.name = name;
        this.districts = districts;
        this.capitalOfRegion = capitalOfRegion;
        area = Arrays.stream(districts).mapToDouble(district -> district.getArea()).sum();
    }

    public double getArea() {
        return area;
    }

    public District[] getDistricts(){
        return districts;
    }

    public City getCapitalOfRegion(){
        return capitalOfRegion;
    }
}
