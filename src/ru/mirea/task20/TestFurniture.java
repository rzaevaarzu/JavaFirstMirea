package ru.mirea.task20;

public class TestFurniture
{

    public static void main(String[] args) {

        FurnitureShop shop = new FurnitureShop();

        System.out.println("Stock: ");
        // Display all furniture in stock
        for (Furniture furniture : shop.getStock())
        {
            System.out.println(furniture);
        }
        System.out.println();

        // Buy three random pieces of furniture
        for (int i = 0; i < 3; i++)
        {
            // select random furniture from stock
            Furniture furniture = shop.getStock().get((int)(Math.random() * shop.getStock().size()));

            System.out.println("You bought a " + furniture.getName() + " for " + furniture.getPrice() + " USD.");
            shop.buyFurniture(furniture);

            furniture.lookAt();
            furniture.use();
        }

        System.out.println("New Stock:");
        // Display all furniture in stock
        for (Furniture furniture : shop.getStock())
        {
            System.out.println(furniture);
        }
    }
}
