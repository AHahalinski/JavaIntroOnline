package by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task4;

import java.util.StringJoiner;

public class Account {

    private String number;
    private boolean isBlocking;
    private double deposit;

    public Account(String number, boolean isBlocking) {
        this.number = number;
        this.isBlocking = isBlocking;
        deposit = 0;
    }

    public Account(String number, boolean isBlocking, double deposit) {
        this.number = number;
        this.isBlocking = isBlocking;
        this.deposit = deposit;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isBlocking() {
        return isBlocking;
    }

    public void setBlocking(boolean blocking) {
        isBlocking = blocking;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        return new StringJoiner(" ")
                .add("number='" + number + "'")
                .add("isBlocking=" + isBlocking)
                .add("deposit=" + deposit)
                .toString();
    }
}
