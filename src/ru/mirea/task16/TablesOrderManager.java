package ru.mirea.task16;

import java.util.ArrayList;
import java.util.HashMap;

public class TablesOrderManager
{
    // The map of orders, where key is table number and value is the order
    private HashMap<Integer, Order> orders = new HashMap<>();

    private int tablesCount;

    /** Creates a new order manager
     * @param tablesCount the number of tables in the restaurant
     */
    public TablesOrderManager(int tablesCount)
    {
        this.tablesCount = tablesCount;
    }

    /** Adds an order to the list of orders
     * @param order the order to add
     */
    public void add(Order order, int tableNumber)
    {
        orders.put(tableNumber, order);
    }

    /** Get order for the given table number
     * @param tableNumber the table number
     * @return the order for the given table number
     */
    public Order getOrder(int tableNumber)
    {
        return orders.get(tableNumber);
    }

    /** Add dish to the order for the given table number
     * @param dish the dish to add
     * @param tableNumber the table number
     */
    public void addDish(Dish dish, int tableNumber)
    {
        Order order = orders.get(tableNumber);
        if (order == null) {
            order = new Order();
            orders.put(tableNumber, order);
        }
        order.add(dish);
    }

    /** Remove order for the given table number
     * @param tableNumber the table number
     */
    public void removeOrder(int tableNumber)
    {
        orders.remove(tableNumber);
    }

    /** Get first free table number
     * @return the first free table number, or -1 if there are no free tables
     */
    public int freeTableNumber()
    {
        for (int i = 0; i < tablesCount; i++) {
            if (!orders.containsKey(i)) {
                return i;
            }
        }
        return -1;
    }

    /** Get all free tables in an array
     * @return an array of free tables
     */
    public ArrayList<Integer> freeTableNumbers()
    {
        ArrayList<Integer> freeTables = new ArrayList<>();
        for (int i = 0; i < tablesCount; i++) {
            if (!orders.containsKey(i)) {
                freeTables.add(i);
            }
        }
        return freeTables;
    }

    /** Get the price sum of all orders
     * @return the price sum of all orders
     */
    public int ordersCostSummary()
    {
        int sum = 0;
        for (Order order : orders.values()) {
            sum += order.getPrice();
        }
        return sum;
    }

    /** Get the quantity of the given item in all orders
     * @param itemName the name of the item
     * @return the quantity of the given item in all orders
     */
    public int itemQuantity(String itemName)
    {
        int quantity = 0;
        for (Order order : orders.values()) {
            quantity += order.itemQuantity(itemName);
        }
        return quantity;
    }
}
