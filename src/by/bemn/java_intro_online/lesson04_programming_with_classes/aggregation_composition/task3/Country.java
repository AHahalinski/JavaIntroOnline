package by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task3;

import java.util.Arrays;

public class Country {
    private String name;
    private City capital;
    private Region[] regions;
    private double area;

    public Country(String name, City capital, Region...regions) {
        this.name = name;
        this.capital = capital;
        this.regions = regions;
        area = Arrays.stream(regions).mapToDouble(region -> region.getArea()).sum();
    }

    public void getCapital(){
        System.out.println();
        System.out.println("Столица: " + capital+ "\n");
    }

    public void getCountOfRegions(){
        System.out.println("Количество областей: \n" + regions.length + "\n");
    }

    public void getArea(){
        System.out.println("Площадь:\n" + area + "  тысяч km2\n");
    }

    public void getCapitalsOfRegions(){
        System.out.println("Обласные центры: ");
        Arrays.stream(regions).forEach(region -> System.out.println(region.getCapitalOfRegion()));
        System.out.println();
    }

    public void getCapitalsOfDistricts(){
        System.out.println("Районные центры: ");

        Arrays.stream(regions)
                .forEach(region -> {
                    Arrays.stream(region.getDistricts())
                            .forEach(district -> System.out.println(district.getCapitalOfDistrict()));
                });
        System.out.println();

    }
}
