package ru.mirea.task8;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * A wait list that works like a queue.
 * @param <T> The type of the element of the wait list.
 */
public interface IWaitList<T>
{
    /**
     * Adds a new element to the back of the wait list.
     * @param element The new element to add.
     */
    public void add(T element);

    /**
     * Removes the element from the front of the wait list.
     * @return The removed element.
     */
    public T remove();

    /**
     * Returns whether the provided element is in the wait list.
     * @param element The element to check for.
     * @return True, if the element is in the wait list. False otherwise.
     */
    boolean contains(T element);

    /**
     * Returns whether the wait list contains ALL of the elements of the provided collection.
     * @param collection The collection to check for.
     * @return True, if the entire collection is in the wait list. False otherwise.
     */
    public boolean containsAll(Collection<T> collection);

    /**
     * Returns whether the wait list is fully empty.
     * @return True, if the wait list is fully empty. False otherwise.
     */
    public boolean isEmpty();
}


/**
 * A generic wait list which works as a Queue (FIFO).
 * @param <T> The type of an element of the wait list.
 */
public class WaitList<T> implements IWaitList<T>
{
    protected ConcurrentLinkedQueue<T> content;

    public WaitList()
    {
        content = new ConcurrentLinkedQueue<T>();
    }

    public WaitList(Collection<T> content)
    {
        this.content = new ConcurrentLinkedQueue<>(content);
    }

    @Override
    public String toString()
    {
        return "WaitList{" +
                "content=" + content +
                '}';
    }

    /**
     * Adds the provided element to the wait list.
     * @param element The new element to add.
     */
    @Override
    public void add(T element)
    {
        content.add(element);
    }

    /**
     * Removes the element from the front of the wait list.
     * @return
     */
    @Override
    public T remove()
    {
        T e = content.peek();
        content.remove(e);
        return e;
    }

    /**
     * Returns whether the provided element is in the wait list.
     * @param element The element to check for.
     * @return True, if the element is in the wait list. False otherwise.
     */
    @Override
    public boolean contains(T element)
    {
        return content.contains(element);
    }

    /**
     * Returns whether the wait list contains ALL of the elements of the provided collection.
     * @param collection The collection to check for.
     * @return True, if the entire collection is in the wait list. False otherwise.
     */
    @Override
    public boolean containsAll(Collection<T> collection)
    {
        return content.containsAll(collection);
    }

    /**
     * Returns whether the wait list is fully empty.
     * @return True, if the wait list is fully empty. False otherwise.
     */
    @Override
    public boolean isEmpty()
    {
        return content.isEmpty();
    }
}

/**
 * A bounded wait list with a maximum amount of elements.
 * @param <T>
 */
public class BoundedWaitList<T> extends WaitList<T>
{
    private int capacity;

    public BoundedWaitList(int capacity)
    {
        this.capacity = capacity;
    }

    /**
     * Returns the capacity of this bounded wait list.
     * @return
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Adds the provided element to the bounded wait list, but only if there is free space left.
     * Otherwise, throws a RuntimeException.
     * @param element The element to add.
     * @exception RuntimeException Tried to add an element to a full bounded wait list.
     */
    @Override
    public void add(T element)
    {
        if (content.size() >= capacity) {
            throw new RuntimeException("В данную очередь нельзя добавить больше элементов!");
        }

        super.add(element);
    }

    @Override
    public String toString()
    {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }
}

/**
 * A version of the WaitList where elements from any point in the wait list can be removed or moved to the back.
 * @param <T>
 */
public class UnfairWaitList<T> extends WaitList<T>
{
    public UnfairWaitList()
    {
    }

    /**
     * Removes the first occurence of the provided element from the wait list.
     * @param element The element to remove.
     */
    public void remove(T element)
    {
        content.remove(element);
    }

    /**
     * Moves the provided element from any position in the wait list to the back.
     * @param element The element to move.
     */
    public void moveToBack(T element) {
        content.remove(element);
        content.add(element);
    }
}


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

