package ru.mirea.task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MatchTracker extends JFrame
{
    JButton buttonMilan = new JButton("AC Milan");
    JButton buttonMadrid = new JButton("Real Madrid");

    JLabel resultLabel = new JLabel("Result: 0 X 0");
    JLabel lastScorerLabel = new JLabel("Last Scorer: N/A");
    JLabel statusLabel = new JLabel("Winner: DRAW");

    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    int scoreMilan;
    int scoreMadrid;

    MatchTracker()
    {
        super("MatchTracker");
        setLayout(new BorderLayout());

        // Prepare top
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.PAGE_AXIS));

        resultLabel.setFont(fnt);
        resultLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        topPanel.add(resultLabel);

        lastScorerLabel.setFont(fnt);
        lastScorerLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        topPanel.add(lastScorerLabel);

        statusLabel.setFont(fnt);
        statusLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        topPanel.add(statusLabel);

        add(topPanel, BorderLayout.NORTH);

        // Prepare buttons
        JPanel buttonsPanel = new JPanel(new GridLayout(1, 2));

        buttonMilan.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                addToMilan();
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

        buttonMadrid.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                addToMadrid();
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

        buttonsPanel.add(buttonMilan);
        buttonsPanel.add(buttonMadrid);

        add(buttonsPanel, BorderLayout.CENTER);

        setSize(650, 400);
        setVisible(true);

        scoreMilan = 0;
        scoreMadrid = 0;
    }

    private void addToMilan() {
        scoreMilan++;

        lastScorerLabel.setText("Last Scorer: AC Milan");

        updateLabels();
    }

    private void addToMadrid() {
        scoreMadrid++;

        lastScorerLabel.setText("Last Scorer: Real Madrid");

        updateLabels();
    }

    private void updateLabels() {
        resultLabel.setText(String.format("Result: %d X %d", scoreMilan, scoreMadrid));

        String state = "";
        if (scoreMilan == scoreMadrid) {
            state = "DRAW";
        }
        else if (scoreMilan > scoreMadrid) {
            state = "AC Milan";
        }
        else if (scoreMilan < scoreMadrid) {
            state = "Real Madrid";
        }

        statusLabel.setText(String.format("Winner: %s", state));
    }

    public static void main(String[] args)
    {
        new MatchTracker();
    }
}
