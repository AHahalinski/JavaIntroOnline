package by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task5.list_tours;

import by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task5.tour.KindTour;
import by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task5.tour.Tour;
import by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task5.tour.Transport;

import java.util.Comparator;
import java.util.List;

public class ListTours {
    private List<Tour> tours;

    public ListTours(List<Tour> tours) {
        this.tours = tours;
    }

    public void addNewTour(Tour tour) {
        tours.add(tour);
    }

    public void removeTour(Tour tour) {
        tours.remove(tour);
    }

    public void showAllTours() {
        tours.stream().forEach(System.out::println);
    }

    public void chose(Tour tour) {
        tours.stream()
                .filter(t -> tour.getNutrition().equals(KindTour.NAN) ? true : t.getNutrition() == tour.getNutrition()
                        && tour.getKindTour().equals(KindTour.NAN) ? true : t.getKindTour() == tour.getKindTour()
                        && t.getDays() >= tour.getDays()
                        && tour.getTransport().equals(Transport.NAN) ? true : t.getTransport() == tour.getTransport()
                        && t.getCost() <= tour.getCost())
                .forEach(System.out::println);
    }

    public void sortTouts(ParamSorting paramSorting) {
        switch (paramSorting) {

            case KIND_TOUR:
                tours.sort(new Comparator<Tour>() {
                    @Override
                    public int compare(Tour o1, Tour o2) {
                        String str1 = o1.getKindTour().toString();
                        String str2 = o2.getKindTour().toString();
                        return str1.compareTo(str2);
                    }
                });
                break;

            case TRANSPORT:
                tours.sort(new Comparator<Tour>() {
                    @Override
                    public int compare(Tour o1, Tour o2) {
                        String str1 = o1.getTransport().toString();
                        String str2 = o2.getTransport().toString();
                        return str1.compareTo(str2);
                    }
                });
                break;

            case NUTRITION:
                tours.sort(new Comparator<Tour>() {
                    @Override
                    public int compare(Tour o1, Tour o2) {
                        return o1.getNutrition().compareTo(o2.getNutrition());
                    }
                });
                break;

            case COST:
                tours.sort(new Comparator<Tour>() {
                    @Override
                    public int compare(Tour o1, Tour o2) {
                        return o1.getCost() == o2.getCost() ? 0 : o1.getCost() > o2.getCost() ? 1 : -1;
                    }
                });
                break;

            case DAYS:
                tours.sort(new Comparator<Tour>() {
                    @Override
                    public int compare(Tour o1, Tour o2) {
                        return o1.getDays() == o2.getDays() ? 0 : o1.getDays() > o2.getDays() ? 1 : -1;
                    }
                });
                break;
        }
        showAllTours();
    }


}
