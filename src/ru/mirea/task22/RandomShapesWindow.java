package ru.mirea.task22;

import javax.swing.*;
import java.awt.*;

/// create an empty gui window
public class RandomShapesWindow extends JFrame {

    Shape[] shapes;

    public RandomShapesWindow() {
        super("Random shapes");
        setSize(400, 300);

        // Create an array of 33 shapes
        shapes = new Shape[33];

        // Fill the first 11 shapes with random circles
        for (int i = 0; i < 11; i++) {
            shapes[i] = new Circle((int)(Math.random() * 400),
                    (int)(Math.random() * 300),
                    new Color((int)(Math.random() * 0x1000000)),
                    (int)(Math.random() * 50 + 5));
        }

        // Fill the next 11 shapes with random rectangles
        for (int i = 11; i < 22; i++) {
            shapes[i] = new Rectangle((int)(Math.random() * 400),
                    (int)(Math.random() * 300),
                    new Color((int)(Math.random() * 0x1000000)),
                    (int)(Math.random() * 50 + 10),
                    (int)(Math.random() * 50 + 10));
        }

        // Fill the next 11 shapes with random triangles
        for (int i = 22; i < 33; i++) {
            shapes[i] = new Triangle((int)(Math.random() * 400),
                    (int)(Math.random() * 300),
                    new Color((int)(Math.random() * 0x1000000)),
                    (int)(Math.random() * 50 + 20),
                    (int)(Math.random() * 50 + 20));
        }


        setLayout(null);


        setVisible(true);
    }

    public void paint(Graphics g) {
        for (int i = 0; i < 33; i++) {
            shapes[i].draw(g);
        }
    }

    public static void main(String[] args) {
        new RandomShapesWindow();
    }
}
