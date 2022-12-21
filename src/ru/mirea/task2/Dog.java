package ru.mirea.task2;

public class Dog {
    private String nick;
    private int age;

    public Dog(String nick, int age) {
        this.nick = nick;
        this.age = age;
    }

    public String getNick() {
        return nick;
    }

    public int getAge() {
        return age;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int humanAge() {
        return age * 7;
    }

    @Override
    public String toString() {
        return "Nick - " + nick +
                "\nAge - " + age;
    }
}
