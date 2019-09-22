package by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task5;

import by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task5.list_tours.ListTours;
import by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task5.list_tours.ParamSorting;
import by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task5.tour.KindTour;
import by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task5.tour.Nutrition;
import by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task5.tour.Tour;
import by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task5.tour.Transport;

import java.util.ArrayList;

/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Main {
    public static void main(String[] args) {
        Tour tour1 = new Tour("Tour 1", KindTour.SIGHTSEEING_TOUR, Nutrition.BB, Transport.PLANE, 14, 1400);
        Tour tour2 = new Tour("Tour 2", KindTour.SEE_CRUISES, Nutrition.RO, Transport.SHIP, 8, 1350);
        Tour tour3 = new Tour("Tour 3", KindTour.SKIING, Nutrition.FB, Transport.PLANE, 10, 800);
        Tour tour4 = new Tour("Tour 4", KindTour.NEW_YEAR, Nutrition.BB, Transport.TRAIN, 3, 500);
        Tour tour5 = new Tour("Tour 5", KindTour.SPA, Nutrition.AI, Transport.PLANE, 12, 2000);
        Tour tour6 = new Tour("Tour 6", KindTour.HOTEL, Nutrition.AI, Transport.BUS, 20, 2500);
        Tour tour7 = new Tour("Tour 7", KindTour.HOTEL, Nutrition.BB, Transport.PLANE, 14, 2000);
        Tour tour8 = new Tour("Tour 8", KindTour.SIGHTSEEING_TOUR, Nutrition.FB, Transport.BUS, 2, 300);

        ArrayList<Tour> list = new ArrayList<>();
        list.add(tour1);
        list.add(tour2);
        list.add(tour3);
        list.add(tour4);
        list.add(tour5);
        list.add(tour6);
        list.add(tour7);
        list.add(tour8);

        ListTours listTours = new ListTours(list);

        listTours.showAllTours();
        System.out.println("\n************************\n");

        listTours.chose(new Tour(KindTour.HOTEL, Nutrition.NAN, Transport.NAN, 6));

        System.out.println("\n********* ВИД ОТДЫХА ***************");
        listTours.sortTouts(ParamSorting.KIND_TOUR);

        System.out.println("\n********* СТОИМОСТЬ ***************");
        listTours.sortTouts(ParamSorting.COST);

        System.out.println("\n********* ДНИ ***************");
        listTours.sortTouts(ParamSorting.DAYS);

        System.out.println("\n********* ТРАНСПОРТ ***************");
        listTours.sortTouts(ParamSorting.TRANSPORT);

        System.out.println("\n********* ПИТАНИЕ ***************");
        listTours.sortTouts(ParamSorting.NUTRITION);

        System.out.println("\n********* БЕЗ СОРТИРОВКИ ***************"); // сохраняется порядок списка до вызова метода
        listTours.sortTouts(ParamSorting.NAN);
    }
}
