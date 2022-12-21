package ru.mirea.task8;

import java.util.Collection;
import java.util.ArrayList;
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

/**
 * A bounded wait list with a maximum amount of elements.
 * @param <T>
 */

/**
 * A version of the WaitList where elements from any point in the wait list can be removed or moved to the back.
 * @param <T>
 */

