package ru.mirea.task6;

import java.util.Random;

public class Student implements Comparable<Student>
{
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getGroup()
    {
        return group;
    }

    public void setGroup(String group)
    {
        this.group = group;
    }

    public int getIdNumber()
    {
        return idNumber;
    }

    public void setIdNumber(int idNumber)
    {
        this.idNumber = idNumber;
    }

    private String group;
    private int idNumber;

    public Student()
    {
        name = "Unknown";
        group = "Unset";
        idNumber = 0;
    }

    public Student(String name, String group, int idNumber)
    {
        this.name = name;
        this.group = group;
        this.idNumber = idNumber;
    }

    @Override
    public int compareTo(Student other)
    {
        if (idNumber == other.getIdNumber())
            return 0;

        if (idNumber < other.getIdNumber())
            return 1;

        return -1;
    }

    /**
     * Returns a randomly generated instance of Student class with a random name and group.
     *
     * @return
     */
    public static Student GetRandom()
    {
        Student s = new Student();

        String[] surnames = new String[]{
                "Ivanov", "Petrov", "Sidorov", "Orlov", "Semenov", "Aleksandrov"
        };

        String[] names = new String[]{
                "Ivan", "Petr", "Vasiliy", "Dmitriy", "Maksim", "Oleg", "Vladislav", "Aleksandr"
        };

        String[] groups = new String[]{
                "IKBO-01-21", "IKBO-02-21", "IKBO-03-21", "IKBO-04-21", "IKBO-05-21", "IKBO-06-21", "IKBO-07-21"
        };

        int name_index = new Random().nextInt(names.length);
        int surname_index = new Random().nextInt(surnames.length);
        int group_index = new Random().nextInt(groups.length);

        s.setName(names[name_index] + " " + surnames[surname_index]);
        s.setGroup(groups[group_index]);

        return s;
    }

    @Override
    public String toString()
    {
        return String.format("Student: %s from %s ID: %d", name, group, idNumber);
    }
}

