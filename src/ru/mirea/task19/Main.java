package ru.mirea.task19;

public class Main {

    public static void main(String[] args) {
        // Create a new human and print conditions of each body part
        Human human = new Human("John", 20);
        // Print out the name and age of the human
        System.out.println("Name: " + human.getName() + ", age: " + human.getAge());

        System.out.println();
        System.out.println("Human condition:");
        human.printCondition();


        System.out.println();
        System.out.println("Human moves:");
        // Move left arm and right leg
        human.getLeftHand().move();
        human.getRightLeg().move();

        // Think and grab something with the right hand
        human.getHead().think();
        human.getRightHand().grab();
    }
}

