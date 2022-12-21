package ru.mirea.task6;


import java.util.Random;

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

