package ru.mirea.task2;

public class Ball {
    private String sport_type;
    private boolean pumped_up;
    private String colour;
    public Ball(){
        sport_type=null;
        pumped_up=false;
        colour=null;
    }
    public Ball(String sport_type){
        this();
        this.sport_type=sport_type;
    }
    public Ball(String sport_type, boolean pumped_up){
        this(sport_type);
        this.pumped_up=pumped_up;
    }
    public Ball(String sport_type, boolean pumped_up, String colour){
        this(sport_type,pumped_up);
        this.colour=colour;
    }
    @Override
    public String toString(){
        return "Тип мяча: "+sport_type+", накачан ли: "+pumped_up+", цвет: "+colour;
    }
}
