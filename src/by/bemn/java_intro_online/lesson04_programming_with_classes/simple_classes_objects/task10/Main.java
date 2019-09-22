package by.bemn.java_intro_online.lesson04_programming_with_classes.simple_classes_objects.task10;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Airline airline1 = new Airline("Minsk", 316, "Boing-747", "07:10", Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY, Day.SATURDAY, Day.SUNDAY);
        Airline airline2 = new Airline("Moscow", 208, "Boing-736", "10:36", Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY, Day.SATURDAY, Day.SUNDAY);
        Airline airline3 = new Airline("London", 1075, "Boing-747", "13:40", Day.SATURDAY);
        Airline airline4 = new Airline("Rome", 756, "Airbus A300", "20:30", Day.MONDAY, Day.WEDNESDAY, Day.FRIDAY);
        Airline airline5 = new Airline("Paris", 800, "Boing-736", "08:50", Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY);

        ScheduleAirlines scheduleAirlines = new ScheduleAirlines(new Airline[] {
                airline1,
                airline2,
                airline3,
                airline4,
                airline5
        });

        List<Airline> list1 = scheduleAirlines.getAirlineByDestination("Minsk");
        List<Airline> list2 = scheduleAirlines.getAirlineByDay(Day.FRIDAY);
        List<Airline> list3 = scheduleAirlines.getAirlineByDayAndTime(Day.MONDAY, "20:25");

        System.out.println("\n******** DESTINATION ********");
        list1.forEach(airline -> System.out.println(airline));

        System.out.println("\n******** DAYS ********");
        list2.forEach(airline -> System.out.println(airline));

        System.out.println("\n******** DAYS AND TIME ********");
        list3.forEach(airline -> System.out.println(airline));

    }
}
