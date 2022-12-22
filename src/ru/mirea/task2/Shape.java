package ru.mirea.task2;

import java.util.ArrayList;

public class Shape {
    private String shape_t;
    public Shape(){
        shape_t=null;
    }
    public Shape(String shape_t){
        this();
        this.shape_t=shape_t;
    }
    @Override
    public String toString(){
        return shape_t;
    }

}