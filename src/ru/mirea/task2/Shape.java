package ru.mirea.task2;

import java.util.ArrayList;

public class Shape {
    private String name;
    private String color;

    public Shape(String color, String name) {
        this.color = color;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name - " + color + "\nColor - " + name;
    }
}
