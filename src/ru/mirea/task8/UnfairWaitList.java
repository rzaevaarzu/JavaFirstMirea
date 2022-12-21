package ru.mirea.task8;

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

