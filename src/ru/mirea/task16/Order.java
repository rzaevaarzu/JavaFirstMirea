package ru.mirea.task16;

import java.util.ArrayList;

/** Contains a list of dishes and drinks, allows to add/remove them, get them */
public class Order
{
    // The list of dishes and drinks
    private ArrayList<Item> items = new ArrayList<Item>();

    // Total size of the order
    private int size;

    /** Adds an item to the order
     * @param item the item to add
     * @return true if the item was added, false otherwise
     */
    public boolean add(Item item) {
        if (item == null) {
            return false;
        }
        items.add(item);
        size++;
        return true;
    }

    /** Removes an item from the order by its name
     * @param item the item to remove
     *             (if there are multiple items with the same name, the first one will be removed)
     * @return true if the item was removed, false otherwise
     */
    public boolean remove(Item item)
    {
        if (item == null) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (items.get(i).getName().equals(item.getName())) {
                items.remove(i);
                size--;
                return true;
            }
        }
        return false;
    }

    /** Removes all items with the given name from the order, and returns the removed items count
     * @param name the name of the items to remove
     * @return the number of removed items
     */
    public int removeAll(String name)
    {
        int removed = 0;
        for (int i = 0; i < size; i++) {
            if (items.get(i).getName().equals(name)) {
                items.remove(i);
                size--;
                removed++;
            }
        }
        return removed;
    }

    /** Returns the amount of items in the order
     * @return the amount of items in the order
     */
    public int itemQuantity()
    {
        return size;
    }

    /** Returns the amount of items with the given name in the order
     * @param name the name of the items to count
     * @return the amount of items with the given name in the order
     */
    public int itemQuantity(String name)
    {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items.get(i).getName().equals(name)) {
                count++;
            }
        }
        return count;
    }

    /** Get the list of all items in the order
     * @return the list of all items in the order
     */
    public Item[] getItems()
    {
        Item[] itemsArray = new Item[size];
        for (int i = 0; i < size; i++) {
            itemsArray[i] = items.get(i);
        }
        return itemsArray;
    }

    /** Get the total price of the order
     * @return the total price of the order
     */
    public double getPrice()
    {
        double price = 0;
        for (int i = 0; i < size; i++) {
            price += items.get(i).getPrice();
        }
        return price;
    }

    /** Get all names of items in the order, without duplicates
     * @return all names of items in the order
     */
    public String[] itemNames()
    {
        ArrayList<String> names = new ArrayList<String>();
        for (int i = 0; i < size; i++) {
            if (!names.contains(items.get(i).getName())) {
                names.add(items.get(i).getName());
            }
        }
        String[] namesArray = new String[names.size()];
        for (int i = 0; i < names.size(); i++) {
            namesArray[i] = names.get(i);
        }
        return namesArray;
    }

    /**
     * Return all items in the dish, sorted by price descending
     *
     * @return all items in the dish, sorted by price descending
     */
    public String[] getSortedItems()
    {
        ArrayList<String> names = new ArrayList<String>();
        for (int i = 0; i < size; i++) {
            names.add(items.get(i).getName());
        }
        for (int i = 0; i < names.size(); i++) {
            for (int j = 0; j < names.size() - 1; j++) {
                if (items.get(j).getPrice() < items.get(j + 1).getPrice()) {
                    String temp = names.get(j);
                    names.set(j, names.get(j + 1));
                    names.set(j + 1, temp);
                }
            }
        }
        String[] namesArray = new String[names.size()];
        for (int i = 0; i < names.size(); i++) {
            namesArray[i] = names.get(i);
        }
        return namesArray;
    }

    /** Returns the string representation of the order
     * @return the string representation of the order
     */
    @Override
    public String toString()
    {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += items.get(i).getName() + " " + items.get(i).getPrice() + "\n";
        }
        return result;
    }
}
