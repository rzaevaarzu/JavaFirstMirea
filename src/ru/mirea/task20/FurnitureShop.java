package ru.mirea.task20;

import java.util.ArrayList;

/// Returns different types of furniture using different methods, prints purchases to console.
public class FurnitureShop
{
    private ArrayList<Furniture> stock;

    /// Create a new FurnitureShop with a stock of predefined 14 pieces of furniture.
    public FurnitureShop()
    {
        stock = new ArrayList<Furniture>();

        // Add 5 chairs to the stock
        for (int i = 0; i < 5; i++)
        {
            Chair chair = new Chair();
            chair.setName("Chair " + i);
            chair.setPrice(40 + 15 * i);
            chair.setLegs(4);
            chair.setHeight(80 + 5 * i);
            stock.add(chair);
        }

        // Add 3 tables to the stock
        for (int i = 0; i < 3; i++)
        {
            Table table = new Table();
            table.setName("Table " + i);
            table.setPrice(100 + 20 * i);
            table.setWidth(100 + 10 * i);
            table.setLength(100 + 5 * i);
            stock.add(table);
        }

        // Add 6 drawers to the stock
        for (int i = 0; i < 6; i++)
        {
            Drawer drawer = new Drawer();
            drawer.setName("Drawer " + i);
            drawer.setPrice(50 + 10 * i);
            drawer.setWidth(50 + 15 * i);
            drawer.setHeight(60 + 5 * i);
            drawer.setDepth(450 + 5 * i);
            stock.add(drawer);
        }

    }

    /// Returns the whole stock of furniture
    public ArrayList<Furniture> getStock()
    {
        return stock;
    }

    /// Removes a piece of furniture from the stock.
    public void buyFurniture(Furniture furniture)
    {
        stock.remove(furniture);
    }
}
