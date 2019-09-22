package by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringJoiner;

/*
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
 * всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Customer {
    private int id;
    private String name;
    private ArrayList<Account> accounts;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        accounts = new ArrayList<>();
    }

    public Customer(int id, String name, ArrayList<Account> accounts) {
        this.id = id;
        this.name = name;
        this.accounts = accounts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    private Account search(String numberOfAccount) {
        return accounts.stream()
                .filter(account -> account.getNumber().equals(numberOfAccount.trim()))
                .findFirst()
                .get();
    }

    public void blocking(String numberOfAccount) {
        Account account = search(numberOfAccount);
        account.setBlocking(true);
    }

    public void anBlocking(String numberOfAccount) {
        Account account = search(numberOfAccount);
        account.setBlocking(false);
    }

    public void find(String number) {
        accounts.forEach(account -> {
            if (account.getNumber().contains(number.trim())) {
                System.out.println(account);
            }
        });
    }

    public void sortByDeposit() {
        accounts.sort(new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return o1.getDeposit() == o2.getDeposit() ? 0 : o1.getDeposit() > o2.getDeposit() ? 1 : -1;
            }
        });

    }

    public void sortByNumber() {
        accounts.sort(new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return o1.getNumber().equals(o2.getNumber()) ? 0 : (o1.getNumber().compareTo(o2.getNumber()) > 0 ? 1 : -1);
            }
        });
    }

    public void getSumPositive() {
        double sum = accounts.stream()
                .filter(account -> account.getDeposit() > 0)
                .mapToDouble(account -> account.getDeposit())
                .sum();
        System.out.println("SUM (+ deposit) = " + sum);
    }

    public void getSumNegative() {
        double sum = accounts.stream()
                .filter(account -> account.getDeposit() < 0)
                .mapToDouble(account -> account.getDeposit())
                .sum();
        System.out.println("SUM (- deposit) = " + sum);
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner("\t");
        if (accounts.size() != 0) {
            accounts.forEach(account -> stringJoiner.add(account.toString()));
        } else {
            stringJoiner.add("null");
        }

        return new StringJoiner(" ")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("accounts=" + stringJoiner)
                .toString();
    }
}
