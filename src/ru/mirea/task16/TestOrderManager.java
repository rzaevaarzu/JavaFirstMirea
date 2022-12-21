package ru.mirea.task16;

public class TestOrderManager
{
    /** Generates a random order.
     */
    private static Order GenerateRandomOrder() {
        // An array of popular dishes with descriptions and prices as double
        String[][] dishes = {
                {"Pizza", "A delicious pizza", "10.5"},
                {"Burger", "A tasty burger", "8.5"},
                {"Salad", "A healthy salad", "5.5"},
                {"Pasta", "A tasty pasta", "7.5"},
                {"Soup", "A hot soup", "6.5"},
                {"Sandwich", "A tasty sandwich", "4.5"},
                {"Fries", "A tasty fries", "3.5"},
                {"Ice cream", "A tasty ice cream", "2.5"},
                {"Cake", "A tasty cake", "1.5"},
                {"Cupcake", "A tasty cupcake", "0.5"},
        };

        // A dictionary of popular drinks with descriptions and prices as double
        String[][] drinks = {
                {"Coca-cola", "A tasty drink", "1.5"},
                {"Fanta", "A tasty drink", "1.5"},
                {"Sprite", "A tasty drink", "1.5"},
                {"Water", "A tasty drink", "1.5"},
                {"Juice", "A tasty drink", "1.5"},
                {"Milk", "A tasty drink", "1.5"},
                {"Tea", "A tasty drink", "1.5"},
                {"Coffee", "A tasty drink", "1.5"},
                {"Beer", "A tasty drink", "1.5"},
                {"Wine", "A tasty drink", "1.5"},
        };

        // A random order
        Order order = new Order();
        // Add 1-4 random dishes
        for (int i = 0; i < 1 + (int)(Math.random() * 4); i++) {
            // Get a random dish
            String[] dish = dishes[(int)(Math.random() * dishes.length)];
            // Add the dish to the order
            order.add(new Dish(dish[0], Double.parseDouble(dish[2]), dish[1]));
        }

        // Add 1-4 random drinks
        for (int i = 0; i < 1 + (int)(Math.random() * 4); i++) {
            // Get a random drink
            String[] drink = drinks[(int)(Math.random() * drinks.length)];
            // Add the drink to the order
            order.add(new Drink(drink[0], Double.parseDouble(drink[2]), drink[1]));
        }

        return order;
    }

    public static void main(String[] args)
    {
        // Create a new order manager
        TablesOrderManager tablesOrderManager = new TablesOrderManager(10);

        // Add 2 random orders
        for (int i = 0; i < 1; i++) {
            // Get a random order
            Order order = GenerateRandomOrder();
            // Add the order to the order manager
            tablesOrderManager.add(order, i);
        }

        System.out.println();
        System.out.println("Added 2 random orders to the order manager");
        System.out.println("Adding order to table 5, if it doesn't exist");

        if (tablesOrderManager.getOrder(5) == null) {
            // Get a random order
            Order order = GenerateRandomOrder();
            // Add the order to the order manager
            tablesOrderManager.add(order, 5);
        }

        // Print all orders
        printAllOrders(tablesOrderManager);

        System.out.println();
        System.out.println("Removing order from table 5");
        // Remove the order for table number 5
        tablesOrderManager.removeOrder(5);

        // Print all orders
        printAllOrders(tablesOrderManager);

        System.out.println();
        System.out.println("Adding dish to table 3");
        // Add a new dish to the order for table number 3
        tablesOrderManager.addDish(new Dish("Pizza", 10.5, "A delicious pizza with cheese and tomato sauce"), 3);

        // Print all orders
        printAllOrders(tablesOrderManager);

        System.out.println();
        // Print free table numbers
        System.out.println("Free table numbers: " + tablesOrderManager.freeTableNumbers());

        // Print total price for all orders
        System.out.println("Total price for all orders: " + tablesOrderManager.ordersCostSummary());

        // check how many pizzas are ordered
        System.out.println("Number of pizzas ordered: " + tablesOrderManager.itemQuantity("Pizza"));

    }

    private static void printAllOrders(TablesOrderManager tablesOrderManager)
    {
        for (int i = 0; i < 10; i++) {

            // if table is free, skip it
            if (tablesOrderManager.getOrder(i) == null) {
                continue;
            }

            // Get the order for the table number
            Order order = tablesOrderManager.getOrder(i);
            // Print the order
            System.out.println("-----------------------");
            System.out.println("Order for table number " + i + ":");
            System.out.println(order);
            System.out.println("Total for order: " + order.getPrice());
            System.out.println("-----------------------");
            System.out.println();
        }
    }
}
