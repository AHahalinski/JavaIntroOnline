package by.bemn.java_intro_online.programming_with_classes_04.simple_classes_objects.task8;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Ivanov", "Ivan", "Ivanovich", "Minsk, Sovetskaya str. 15-185", 1547985445, "DS1585445Dby");
        Customer customer2 = new Customer(3, "Sidorov", "Sidr", "Sidorovich", "Vitebsk, Minskaya str. 1-3", 1654916848, "DS98888445Dby");
        Customer customer3 = new Customer(100, "Petrov", "Petr", "Petrovich", "Homel, Stroiteleq str. 23-65", 1367985445, "DS7896545Dby");
        Customer customer4 = new Customer(25, "Andreeva", "Adriana", "Andreevna", "Minsk, Pushkina str. 5-257", 1147986665, "SD6685445Dby");
        Customer customer5 = new Customer(98, "Chapaev", "Ivan", "Sergeevich", "Minsk, Sovetskaya str. 9-41", 1547999945, "DS1585445Dus");
        Customer customer6 = new Customer(26, "Andreeva", "Adriana", "Sergeevna", "Minsk, Pushkina str. 5-257", 1247986665, "SD5555555Dby");

        Customer[] customers = new Customer[] {
                customer1,
                customer2,
                customer3,
                customer4,
                customer5,
                customer6
        };
        BankCustomers bankCustomers = new BankCustomers(customers);

        System.out.println("******All list of customers*******\n");

        List<Customer> customerListAll = bankCustomers.getAllListCustomers();
        customerListAll.stream().forEach(o -> System.out.println(o + "\n"));

        System.out.println("******By card*******\n");

        List<Customer> customersWithCardNumber = bankCustomers.getListCustomersByCard(100, 1500000000);
        customersWithCardNumber.stream().forEach(o -> System.out.println(o + "\n"));
    }
}
