package ru.mirea.task2;

public class Dog {
    private String dog_name;
    private int dog_age;
    public Dog(String name, int age){
        dog_name=name;
        dog_age=age;
    }
    public void setDog_name(String dog_name){
        this.dog_name=dog_name;
    }
    public String getDog_name(){
        return dog_name;
    }
    public void setDog_age(int dog_age){
        this.dog_age=dog_age;
    }
    public int getDog_age(){
        return dog_age;
    }
    public int dog_age_to_human(){
        return dog_age*7;
    }
    @Override
    public String toString(){
        return "Кличка: "+ dog_name +" Возраст: "+dog_age+" Возраст в человеческих годах: "+dog_age_to_human()+" ";
    }
}