package ru.mirea.task23;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GuessingGame extends JFrame
{

    JLabel labelTitle = new JLabel("Guessing Game");

    JLabel labelGuess = new JLabel("Guess a number between 1 and 20:");

    JTextField textGuess = new JTextField(2);

    JButton buttonGuess = new JButton("Guess");

    JLabel labelGuessResult = new JLabel("");

    Font titleFont = new Font("Roboto", Font.BOLD, 20);
    Font boldFont = new Font("Roboto", Font.BOLD, 14);
    Font normalFont = new Font("Roboto", Font.PLAIN, 14);

    int randomNumber;
    int guessCount;

    public GuessingGame()
    {
        super("Guessing Game");
        setSize(500, 300);

        randomNumber = (int) (Math.random() * 20 + 1);
        guessCount = 0;

        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        // Prepare title
        labelTitle.setFont(titleFont);
        labelTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(labelTitle);

        // Prepare label for guess
        labelGuess.setFont(boldFont);
        labelGuess.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(labelGuess);

        // Prepare text field for guess
        textGuess.setFont(normalFont);
        textGuess.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(textGuess);

        // Prepare button for guess
        buttonGuess.setFont(boldFont);
        buttonGuess.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(buttonGuess);

        buttonGuess.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                guess();
            }

            @Override
            public void mousePressed(MouseEvent e)
            {

            }

            @Override
            public void mouseReleased(MouseEvent e)
            {

            }

            @Override
            public void mouseEntered(MouseEvent e)
            {

            }

            @Override
            public void mouseExited(MouseEvent e)
            {

            }
        });

        // Prepare label for guess result
        labelGuessResult.setFont(boldFont);
        labelGuessResult.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(labelGuessResult);

        add(panel, BorderLayout.NORTH);

        setVisible(true);
    }

    /// Guessing game logic
    private void guess()
    {
        int guess = Integer.parseInt(textGuess.getText());
        guessCount++;

        if (guess == randomNumber)
        {
            labelGuessResult.setForeground(Color.green);
            labelGuessResult.setText("You guessed the number in " + guessCount + " guesses!");
        }
        else if (guessCount >= 3) {
            labelGuessResult.setForeground(Color.RED);
            labelGuessResult.setText("You lost! The number was " + randomNumber);
        }
        else if (guess < randomNumber)
        {
            labelGuessResult.setForeground(Color.BLUE);
            labelGuessResult.setText("Your guess is too low!");
        }
        else if (guess > randomNumber)
        {
            labelGuessResult.setForeground(Color.orange);
            labelGuessResult.setText("Your guess is too high!");
        }
    }

    public static void main(String[] args)
    {
        GuessingGame game = new GuessingGame();
    }
}
