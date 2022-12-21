package ru.mirea.task8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

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
