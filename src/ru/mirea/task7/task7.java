package ru.mirea.task7;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class Drunker
{
    public static void main(String[] args) {

        ArrayDeque<Integer> first = new ArrayDeque<Integer>();
        ArrayDeque<Integer> second = new ArrayDeque<Integer>();

        Scanner scanner = new Scanner(System.in);

        int[] cards = new int[5];
        for (int i = 0; i < 5; i++)
        {
            first.push(scanner.nextInt());
        }

        for (int i = 0; i < 5; i++)
        {
            second.push(scanner.nextInt());
        }

        int moves = 0;

        while (moves <= 106 && !first.isEmpty() && !second.isEmpty()) {
            moves += 1;

            int f = first.pop();
            int s = second.pop();
            if (f > s) {
                second.push(f);
                second.push(s);
            }
            else {
                first.push(f);
                first.push(s);
            }

        }

        String output = "";

        if (moves >= 106) {
            output = "botva";
        }
        else if (first.isEmpty()) {
            output = String.format("second %d", moves);
        }
        else if (second.isEmpty()) {
            output = String.format("first %d", moves);
        }

        System.out.println(output);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // считываем данные с клавиатуры
        Stack<Integer> player1 = new Stack();
        Stack<Integer> player2 = new Stack();

        for (int i = 0; i < 5; i++) {
            player1.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            player2.add(sc.nextInt());
        }
        int i = 0;
        int k = 0;
        int j = 0;

        while (i != 106) {
            if (player1.isEmpty() || player2.isEmpty()) break;
            if (player2.get(j) < player1.get(k)) {
                if (player1.get(k) == 9 && player2.get(j) == 0) {
                    player2.add(player2.get(j));
                    player2.add(player1.get(k));
                    player2.remove(j);
                    player1.remove(k);
                }
                else {
                    player1.add(player1.get(k));
                    player1.add(player2.get(j));
                    player1.remove(k);
                    player2.remove(j);
                }
                i++;
            }
            else if (player1.get(k) < player2.get(j)) {
                if ((player1.get(k) == 0 && player2.get(j) == 9)) {
                    player1.add(player1.get(k));
                    player1.add(player2.get(j));
                    player1.remove(k);
                    player2.remove(j);
                }
                else {
                    player2.add(player2.get(j));
                    player2.add(player1.get(k));
                    player2.remove(j);
                    player1.remove(k);
                }
                i++;
            }
        }
        if (i == 106) System.out.println("botva");
        if (player1.isEmpty()) System.out.println("second " + i);
        if (player2.isEmpty()) System.out.println("first " + i);
    }
}

