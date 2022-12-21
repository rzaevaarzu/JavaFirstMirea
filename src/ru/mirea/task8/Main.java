package ru.mirea.task8;

import java.util.ArrayList;

public class Main {

    /**
     * Serves all customers in the provided IWaitList.
     * @param list The IWaitList to serve.
     * @param <T>
     */
    private static <T> void ServeAll(IWaitList<T> list) {
        while (!list.isEmpty()) {
            System.out.println("Serving customer: " + list.remove());
        }
    }

    public static void main(String[] args) {

        UnfairWaitList<String> bakery = new UnfairWaitList<String>();

        bakery.add("Petrov");
        bakery.add("Ivanov");
        bakery.add("Sidorov");
        bakery.add("Orlov");
        System.out.println("Current queue to bakery: " + bakery.toString());

        System.out.println("Serving customer: " + bakery.remove());

        bakery.moveToBack("Ivanov");
        System.out.println("Ivanov was pushed away from the counter.");
        System.out.println("Current queue: " + bakery.toString());

        ServeAll(bakery);

        System.out.println("----------------");

        ArrayList<String> customers = new ArrayList<String>();
        customers.add("Ivan");
        customers.add("Petr");
        customers.add("Semen");
        customers.add("Dmitriy");
        customers.add("Vasiliy");
        customers.add("Aleksandr");

        WaitList<String> other_place = new WaitList(customers);
        UnfairWaitList<String> another_place = new UnfairWaitList();

        for (String customer : customers)
        {
            another_place.add(customer);
        }

        another_place.remove("Dmitriy");
        another_place.moveToBack("Semen");
        another_place.moveToBack("Ivan");

        System.out.println("Current queue to other place: " + other_place.toString());

        ServeAll(other_place);

        System.out.println("--------------");

        System.out.println("Current queue to another place: " + another_place.toString());

        ServeAll(another_place);
    }
}

