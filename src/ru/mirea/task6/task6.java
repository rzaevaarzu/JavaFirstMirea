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


public class TestStudent
{

    public static void main(String[] args) {

        int student_count = 7;

        Student[] students = new Student[student_count];
        for (int i = 0; i < student_count; i++)
        {
            students[i] = Student.GetRandom();
            students[i].setIdNumber(i + 1);
        }

        // Shuffle array
        for (int i = 0; i < students.length; i++) {
            int swapWith = new Random().nextInt(students.length);
            Student temp = students[swapWith];
            students[swapWith] = students[i];
            students[i] = temp;
        }

        for (int i = 0; i < student_count; i++)
        {
            System.out.println(students[i]);
        }

        System.out.println("Sorting via Insertion Sort...");
        insertion_sort(students);

        System.out.println("Sorted: ");
        for (int i = 0; i < student_count; i++)
        {
            System.out.println(students[i]);
        }
    }

    private static void insertion_sort(Student[] students)
    {
        int n = students.length;
        for (int i = 1; i < n; i++)
        {
            Student curr = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].compareTo(curr) < 0) {
                students[j + 1] = students[j];
                j -= 1;
            }

            students[j + 1] = curr;
        }
    }
}

