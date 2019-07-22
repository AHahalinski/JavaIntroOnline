package by.bemn.java_intro_online.programming_with_classes_04.simple_classes_objects.task8;

import java.util.*;
import java.util.stream.Collectors;

public class BankCustomers {
    private Customer[] customers;

    public BankCustomers() {
    }

    public BankCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public List<Customer> getAllListCustomers() {

//        class CustomerNameAndCardComparator implements Comparator<Customer> {
//            public int compare(Customer a, Customer b){
//                return (a.getSurname()+a.getName()+a.getPatronymic())
//                        .compareTo(b.getSurname()+b.getName()+b.getPatronymic());
//            }
//        }
//
//        Collections.sort(Arrays.asList(customers), new CustomerNameAndCardComparator());
        return Arrays.stream(customers).sorted((o1, o2) -> (o1.getSurname()+o1.getName()+o1.getPatronymic())
                .compareTo(o2.getSurname()+o2.getName()+o2.getPatronymic())).collect(Collectors.toList());
//         customers;
    }

    public List<Customer> getListCustomersByCard(int min, int max) {
        return Arrays.stream(customers)
                .filter(customer -> customer.getCardNumber() >= min && customer.getCardNumber()<=max)
                .collect(Collectors.toList());
    }
}
