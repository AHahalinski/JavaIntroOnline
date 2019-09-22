package by.bemn.java_intro_online.lesson04_programming_with_classes.simple_classes_objects.task6;

/*
 * Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
 * изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
 * В случае недопустимых значений полей поле устанавливается в значение 0.
 * Создать методы изменения времени на заданное количество часов, минут и секунд.
 */

public class Clock {
    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;

    public Clock() {
    }

    public Clock(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public void setHours(int hours) {
        if (hours > 23 || hours < 0) {
            this.hours = 0;
        } else {
            this.hours = hours;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes > 59 || minutes < 0) {
            this.minutes = 0;
        } else {
            this.minutes = minutes;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds > 59 || seconds < 0) {
            this.seconds = 0;
        } else {
            this.seconds = seconds;
        }
    }

    public void addHours(int hours) {
        if (hours < 0) {
            this.hours = 0;
        } else if (this.hours + hours > 24) {
            this.hours = 24;
        } else {
            this.hours = this.hours + hours;
        }
    }

    public void addMinutes(int minutes) {
        if (minutes < 0) {
            this.minutes = 0;
        } else if (this.minutes + minutes > 59) {
            addHours(minutes / 60);
            this.minutes = this.minutes + minutes % 60;
        } else {
            this.minutes = this.minutes + minutes;
        }
    }

    public void addSeconds(int seconds) {
        if (seconds < 0) {
            this.seconds = 0;
        } else if (this.seconds + seconds > 59) {
            this.seconds = this.seconds + seconds % 60;
            setMinutes(seconds / 60);
        } else {
            this.seconds = this.seconds + seconds;
        }
    }

    public void setTime(int hours, int minutes, int seconds) {
        addSeconds(seconds);
        setMinutes(minutes);
        addHours(hours);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
