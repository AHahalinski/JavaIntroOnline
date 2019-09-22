package by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task4;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1245, "Ivanov" );

        System.out.println(customer);

        Account account1 = new Account("125RDF115", false, 258.3);
        Account account2 = new Account("hj5RDF1t5", false, 23.9);
        Account account3 = new Account("df458tg99", true, 500);
        Account account4 = new Account("333RBY115", false, 0.95);
        Account account5 = new Account("9958vb25BY", false, -0.8);

        customer.addAccount(account1);

        System.out.println(customer);

        customer.addAccount(account2);
        customer.addAccount(account3);
        customer.addAccount(account4);
        customer.addAccount(account5);

        System.out.println(customer);
        customer.sortByDeposit();
        System.out.println(customer);
        customer.sortByNumber();
        System.out.println(customer);

        customer.find("123");
        customer.find("125");
        customer.find("B");
        System.out.println(customer);
        customer.blocking("9958vb25BY");
        System.out.println(customer);

        customer.getSumNegative();
        customer.getSumPositive();

    }

}
