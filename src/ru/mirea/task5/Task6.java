package ru.mirea.task5;

public class Task6
{
    public static String task_6(int n, int i) {
        // i- дополнительный параметр. При вызове должен быть равен 2
        if (n < 2) {
            return "NO";
        }
        else if (n == 2) {
            return "YES";
        }
        else if (n % i == 0) {
            return "NO";
        }
        else if (i < n / 2) {
            return task_6(n, i + 1);
        } else {
            return "YES";
        }
    }
}