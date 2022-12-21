package ru.mirea.task15;

import javax.swing.*;

public class Calculator {
    private JFrame window;
    public Calculator(){
        window = new JFrame("Calculator");
        window.setSize(260,350);
        window.add(new Panel());
        window.setLocationRelativeTo(null);//Центр экрана
        window.setResizable(false);//Неизменность размера
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculator();
            }
        });
    }
}