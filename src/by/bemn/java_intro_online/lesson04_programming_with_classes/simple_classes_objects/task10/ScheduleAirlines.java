package by.bemn.java_intro_online.lesson04_programming_with_classes.simple_classes_objects.task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ScheduleAirlines {
    private Airline[] airlines;

    public ScheduleAirlines(Airline[] airlines) {
        this.airlines = airlines;
    }

    public Airline[] getAirlines() {
        return airlines;
    }

    public void setAirlines(Airline[] airlines) {
        this.airlines = airlines;
    }

    public List<Airline> getAirlineByDestination(String destination) {
        if (destination == null || destination.isEmpty()) {
            return Arrays.asList(airlines);
        } else {
            return Arrays.stream(airlines).filter(airline -> airline.getDestination().equalsIgnoreCase(destination))
                    .collect(Collectors.toList());
        }
    }

    public List<Airline> getAirlineByDay(Day day) {
        List<Airline> list = new ArrayList<>();

        for (Airline airline: airlines) {
            for (Day d: airline.getDaysDeparture()) {
                if(d.equals(day)) {
                    list.add(airline);
                }
            }
        }

        return list;
    }

    public List<Airline> getAirlineByDayAndTime(Day day, String time) {
        return getAirlineByDay(day).stream().filter(airline -> airline.getTimeDeparture().compareTo(time) == 1)
                .collect(Collectors.toList());
    }
}
