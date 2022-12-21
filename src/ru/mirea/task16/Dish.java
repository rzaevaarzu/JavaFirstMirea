package ru.mirea.task16;


    public class Dish implements Item {
        private final String name;
        private final double price;
        private final String description;

        /**
         * @param name        the name of the dish
         * @param price       the price of the dish
         * @param description the description of the dish
         */
        public Dish(String name, double price, String description) {
            this.name = name;
            this.price = price;
            this.description = description;
        }

        /**
         * @param name        the name of the dish
         * @param description the description of the dish
         */
        public Dish(String name, String description) {
            this.price = 0;
            this.name = name;
            this.description = description;
        }

        /**
         * @return the name of the dish
         */
        public String getName() {
            return name;
        }

        /**
         * @return the price of the dish
         */
        public double getPrice() {
            return price;
        }

        /**
         * @return the description of the dish
         */
        public String getDescription() {
            return description;
        }

        /**
         * @return a string representation of the dish
         */
        public String toString() {
            return name + " (" + price + "): " + description;
        }
    }