package ru.mirea.task8;

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

